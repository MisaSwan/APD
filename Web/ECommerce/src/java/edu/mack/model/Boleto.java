/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.model;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 31327291
 */
public class Boleto implements MetodoPagamento{

    @Override
    public void execute( HttpServletResponse response) {
        try {
            response.sendRedirect("boleto.aspx");
        } catch (IOException ex) {
            Logger.getLogger(Boleto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
