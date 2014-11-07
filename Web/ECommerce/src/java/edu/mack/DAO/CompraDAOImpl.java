/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.DAO;

import edu.mack.entity.Endereco;
import edu.mack.entity.ItemPedido;
import edu.mack.entity.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 31327291
 */
public class CompraDAOImpl implements CompraDAO {

    @Override
    public boolean logPurchase(Pedido order, int codUsuario) {

        try {
            Connection connection = UtilDAO.getConn();

            String sql = "INSERT INTO apd.Pedido (id_usuario,endereco,nome_produto,preco_produto,qtd_produto,total,status,numero_pedido) values(?,?,?,?,?,?,?,?)";                         
            System.out.println(codUsuario);
            System.out.println(order.getEnd().toString());
            System.out.println(order.getProd().getName());
            System.out.println(order.getProd().getPrice());
            System.out.println(order.getQtdProduto());
            System.out.println(order.getTotalPrice());
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, codUsuario);
            stmt.setString(2, order.getEnd().toString());
            stmt.setString(3, order.getProd().getName());
            stmt.setDouble(4, order.getProd().getPrice());
            stmt.setDouble(5, order.getQtdProduto());
            stmt.setDouble(6, order.getTotalPrice());            
            stmt.setString(7, "Pendente");            
            stmt.setInt(8, order.getNumeroPedido());            
            
            stmt.execute();
            connection.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
    public boolean updateOrderStatus(String orderNumber, String status) {

        try {
            Connection conn = UtilDAO.getConn();
            if (!status.equals("OK") && !status.equals("NOK") && !status.equals("undefined")) {
                return false;
            }
            int numeroPedido = Integer.parseInt(orderNumber);
            String cmd = "UPDATE PEDIDO SET STATUS = ? WHERE NUMERO_PEDIDO=?";
            PreparedStatement stmt = conn.prepareStatement(cmd);

            stmt.setString(1, status);
            stmt.setInt(2, numeroPedido);
            
            stmt.execute();
            conn.commit();
            return true;
        } catch (Exception e) {
            return false;
        }


    }

}
