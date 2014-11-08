/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mack.web;

import edu.mack.DAO.ProdutoDAOImpl;
import edu.mack.entity.Produto;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author robert
 */
@WebService(serviceName = "ECommerceWSBuscador")
public class ECommerceWSBuscador {

    /**
     * This is a sample web service operation
     */
    ProdutoDAOImpl dao = new ProdutoDAOImpl();
    @WebMethod(operationName = "loadProducts")
    public List<Produto> loadProducts() {
        return dao.loadProducts();
    }
    @WebMethod(operationName = "filterProductsByCategory")
    public List<Produto> filterProductsByCategory(String category) {
        return dao.filterProductsByCategory(category);
    }
    @WebMethod(operationName = "filterProductsByPrice")
    public List<Produto> filterProductsByPrice(boolean minorPrice) {
        return dao.filterProductsByPrice(minorPrice);
    }
    @WebMethod(operationName = "filterProductsByName")
    public List<Produto> filterProductsByName(String name) {
        return dao.filterProductsByName(name);
    }
}
