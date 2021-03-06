/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.model;

import edu.mack.DAO.CompraDAOImpl;
import edu.mack.entity.Endereco;
import edu.mack.entity.ItemPedido;
import edu.mack.entity.Pedido;
import edu.mack.entity.Produto;
import edu.mack.entity.Usuario;
import java.io.IOException;
import java.util.Random;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 31327291
 */
public class ComprarProdutosCommand implements Command {

    CompraDAOImpl compraDAO;

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Random ran = new Random();
        int orderNumber = ran.nextInt(900)+100;
        String productName = request.getParameter("productName");
        String productPrice = request.getParameter("productPrice");
        String quantity = request.getParameter("quantity");
        String addressStreet = request.getParameter("addressStreet");
        String addressNumber = request.getParameter("addressNumber");
        String addressCompl = request.getParameter("addressCompl");
        String addressNeighborhood = request.getParameter("addressNeighborhood");
        String addressCity = request.getParameter("addressCity");
        String paymentMethod = request.getParameter("paymentMethod");        
        Endereco address = new Endereco(addressStreet, addressNumber, addressCompl, addressNeighborhood, addressCity);

        Produto product = new Produto();
        product.setName(productName);
        System.out.println(productPrice);
        product.setPrice(Double.parseDouble(productPrice.replace("R$", "")));

        int itemQuantity = Integer.parseInt(quantity);        
        Pedido order = new Pedido(address, product, itemQuantity,orderNumber);
        request.getSession().setAttribute("orderPrice", order.getTotalPrice()+"");
        request.getSession().setAttribute("orderNumber", orderNumber+"");
        
        compraDAO = new CompraDAOImpl();

        boolean success;
        if(request.getSession().getAttribute("usuarioLogado")!=null){
             success = compraDAO.logPurchase(order, ((Usuario)request.getSession().getAttribute("usuarioLogado")).getId());
        }else{
            success = compraDAO.logPurchase(order, 0);
        }        
        if (success) {
            MetodoPagamento method;
            System.out.println(paymentMethod);
            if (paymentMethod.equals("boleto")) {                
                method = new Boleto();                
            } else {
                method = new BancoDebito();
            }
            method.execute(request,response);
        }
    }

    public String clientName(HttpServletRequest request) {
        if (request.getCookies() != null) {
            for (Cookie c : request.getCookies()) {
                if (c.getName().equals("OnlineUser")) {
                    return c.getValue();
                }
            }
        }
        return "Unregistred user";
    }
}
