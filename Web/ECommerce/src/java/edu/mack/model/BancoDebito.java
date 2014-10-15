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
            response.sendRedirect("index.jsp");
        } catch (IOException ex) {
            Logger.getLogger(BancoDebito.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
    
}
