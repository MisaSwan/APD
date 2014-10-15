/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.DAO;

import edu.mack.entity.Endereco;
import edu.mack.entity.Pedido;

/**
 *
 * @author 31327291
 */
public interface CompraDAO {
    
    public boolean logPurchase(Pedido order, int codUsuario);
}
