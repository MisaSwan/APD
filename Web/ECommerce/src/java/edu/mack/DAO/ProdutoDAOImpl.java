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
public class ProdutoDAOImpl implements ProdutoDAO {

    @Override
    public List<Produto> searchProducts(String category, String price) {
        try {
            String query = "";

            if (!category.equals("")) {
                query = "where categoria like '%" + category + "%'";
            }
            if (!price.equals("") && price.equals("max")) {
                query += "order by preco desc";
            }
            Connection connection = UtilDAO.getConn();
            List<Produto> productList = new ArrayList<Produto>();
            String sql = "Select * from produto " + query;
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produto product = new Produto();
                product.setName(rs.getString("nome"));
                product.setPrice(rs.getDouble("preco"));
                product.setDescription(rs.getString("descricao"));
                product.setImage(rs.getString("imagem"));
                productList.add(product);

            }
            return productList;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Produto> loadProducts() {
        try {             
            Connection connection = UtilDAO.getConn();
            String sql = "Select * from Produto";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Produto> products = new ArrayList();
            while (rs.next()) {
                Produto product = new Produto();
                product.setName(rs.getString("nome"));
                product.setPrice(rs.getDouble("preco"));
                product.setDescription(rs.getString("descricao"));
                product.setImage(rs.getString("imagem"));
                products.add(product);
            }
            return products;
        } catch (Exception e) {
            return null;
        }

    }
}
