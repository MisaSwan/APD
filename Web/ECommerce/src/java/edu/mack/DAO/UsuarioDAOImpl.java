/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.DAO;


import edu.mack.entity.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author 31327291
 */
public class UsuarioDAOImpl {
 
    public Usuario loadUser(Usuario user){
        try{
            
           Connection connection = UtilDAO.getConn();

            String sql = "Select * from Users where Login = ? AND Password =?";            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getPassword());           
            ResultSet rs = stmt.executeQuery();
           Usuario userLoaded = new Usuario();
            while (rs.next()) {   
                userLoaded.setName(rs.getString("Name"));
                userLoaded.setLogin(rs.getString("Login"));
                userLoaded.setPassword(rs.getString("Password"));
            }

            return userLoaded;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}