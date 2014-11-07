/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.model;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 31327291
 */
public class BancoDebito implements MetodoPagamento{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {      
            request.getParameter("bank_name");
            String urlParam = "orderPrice="+request.getSession().getAttribute("orderPrice")+"&orderNumber="+request.getSession().getAttribute("orderNumber");
            
            response.sendRedirect("http://localhost:8080/Projeto_Banco_Teste/Index.jsp?"+urlParam);
        } catch (IOException ex) {
            Logger.getLogger(BancoDebito.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
    
}
