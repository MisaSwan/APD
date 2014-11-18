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
public class BancoDebito implements MetodoPagamento {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            String bankOption = request.getParameter("bank_option");
            String urlParam = "orderPrice=" + request.getSession().getAttribute("orderPrice") + "&orderNumber=" + request.getSession().getAttribute("orderNumber") + "&orderShop=E-Mack";
            String projectUrl = "";
            if (bankOption.equals("1")) {
                projectUrl = "http://ip/projeto1/pagina?";
            }
            if (bankOption.equals("2")) {
                projectUrl = "http://ip/projeto2/pagina?";
            }
            if (bankOption.equals("3")) {
                projectUrl = "http://ip/projeto3/pagina?";
            }
            response.sendRedirect(projectUrl + urlParam);
        } catch (IOException ex) {
            Logger.getLogger(BancoDebito.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
