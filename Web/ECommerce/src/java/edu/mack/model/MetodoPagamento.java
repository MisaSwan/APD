/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.model;

import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 31327291
 */
public interface MetodoPagamento {
    
    public void execute( HttpServletResponse response);
}
