/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.model;

import edu.mack.entity.Endereco;
import edu.mack.entity.ItemPedido;
import edu.mack.entity.Pedido;
import edu.mack.entity.Produto;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 31327291
 */
public class ComprarProdutosCommand implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String productName = request.getParameter("productName");
        String quantity = request.getParameter("quantity");
        String addressStreet =  request.getParameter("addressStreet");
        String addressNumber =  request.getParameter("addressNumber");
        String addressCompl =  request.getParameter("addressCompl");
        String addressNeighborhood =  request.getParameter("addressNeighborhood");
        String addressCity =  request.getParameter("addressCity");
        Endereco address = new Endereco(addressStreet, addressNumber, addressCompl, addressNeighborhood, addressCity);
        
        Produto product = new Produto();
        product.setName("productName");
        Pedido order = new Pedido();
        int itemQuantity = Integer.parseInt(quantity);
        ItemPedido item = new ItemPedido(product,itemQuantity);
       
        
        
        
        
        
    }
    
}
