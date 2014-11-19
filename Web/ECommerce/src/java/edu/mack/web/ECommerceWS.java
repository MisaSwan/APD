/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.web;

import edu.mack.DAO.CompraDAOImpl;
import edu.mack.DAO.ProdutoDAOImpl;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 31327291
 */
@WebService(serviceName = "ECommerceWS")
public class ECommerceWS {

    
    @WebMethod(operationName = "updateOrderStatus")
    public void updateOrderStatus(String orderNumber,String status) throws Exception {        
        CompraDAOImpl dao = new CompraDAOImpl();
        if("".equals(orderNumber))
            throw new Exception();
          if("".equals(status))
            throw new Exception();
        
        if(!status.equals("OK") && !status.equals("NOK")){
            status = "undefined";
        }
        
        dao.updateOrderStatus(orderNumber, status);
    }
}
