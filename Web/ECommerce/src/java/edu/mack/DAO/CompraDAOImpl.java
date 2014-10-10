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
    public boolean logPurchase(Pedido order, String client,Endereco address) {

        try {
            Connection connection = UtilDAO.getConn();

            String sql = "insert into Pedido values (1)";
            //OrderID,Client,LogDate
            String sql2 = "insert into ItemPedido values(1,2,3)";
            //ItemID,OrderID,LogDate,ProductName,Quantity,TotalPrice   
            String sql3 = "insert into DeliveryLog values(1,2,3)";
            //DeliveryID,OrderID,LogDate,Client,Address
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, client);
            stmt.executeQuery();
            stmt = connection.prepareStatement(sql2);
            for (ItemPedido item : order.getCart()) {
                stmt.setString(1, item.getProduct().getName());
                stmt.setString(2, item.getQuantity() + "");
                stmt.setString(3, item.getTotalPrice() + "");
                stmt.executeQuery();
            }
             stmt = connection.prepareStatement(sql3);
             stmt.setString(1, client);
             stmt.setString(2, address.toString());
             stmt.executeQuery();
            return true;
        } catch (Exception ex) {
                return false;
        }

    }

}
