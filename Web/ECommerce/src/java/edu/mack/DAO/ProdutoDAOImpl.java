/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.DAO;

import edu.mack.entity.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 31327291
 */
public class ProdutoDAOImpl implements ProdutoDAO{

    @Override
    public List<Produto> searchProducts(String category,String price) {
        try {
            String query="";
          
            if(!category.equals("") ){
                query = "where category like '%"+category+"%'";
            }
            if(!price.equals("") && price.equals("max")){                
                   query += "order by price desc";
            }
            Connection connection = UtilDAO.getConn();
            List<Produto> productList = new ArrayList<Produto>();
            String sql = "Select * from Products " + query;
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
                       
            while (rs.next()) {
                Produto product = new Produto();
                product.setName(rs.getString("Name"));
                product.setPrice(rs.getDouble("Price"));
                product.setDescription(rs.getString("Description"));
                product.setImage(rs.getString("Image"));               
                productList.add(product);                               
            }
            return productList;
        } catch (Exception e) {
            return null;
        }
    }
    
}
