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
import java.io.IOException;
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

        String productName = request.getParameter("productName");
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

        int itemQuantity = Integer.parseInt(quantity);
        ItemPedido item = new ItemPedido(product, itemQuantity);
        Pedido order = new Pedido();
        order.addItemList(item);
        compraDAO = new CompraDAOImpl();

        boolean success = compraDAO.logPurchase(order, clientName(request), address);
        if (success) {
            if (paymentMethod.equals("boleto")) {
                response.sendRedirect("boleto.jsp");
            } else {
                //Call Bank API   
            }
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
