/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.model;


import edu.mack.DAO.UsuarioDAOImpl;
import edu.mack.entity.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 31327291
 */
public class LoginUsuarioCommand implements Command {

    private UsuarioDAOImpl usuarioDAO;

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("usernameLogin");
        String pass = request.getParameter("passLogin");
        String msgError = "";
        boolean hasError = false;

        if (login == null || pass == null) {
            hasError = true;
            msgError = "Login ou senha inválidos";
        }

        if (!hasError) {
            Usuario userToLoad = new Usuario();
            userToLoad.setLogin(login);
            userToLoad.setPassword(pass);

            Usuario userFromDB = this.loadUser(userToLoad);
            if (userFromDB.getLogin() != null) {
                userFromDB.setIsLogged(true);
                request.getSession().setAttribute("loggedUser", userFromDB);
                Cookie c = new Cookie("OnlineUser", userFromDB.getLogin());
                response.addCookie(c);
                response.sendRedirect("feed.jsp");
            } else {
                msgError = "User not found";
            }
        } else {
            request.getSession().setAttribute("ErrorLogin", msgError);
            response.sendRedirect("index.jsp");
        }
    }

    public Usuario loadUser(Usuario user) {
        usuarioDAO = new UsuarioDAOImpl();
        return usuarioDAO.loadUser(user);
    }
}