/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mack.DAO;

import edu.mack.entity.Produto;
import java.util.List;

/**
 *
 * @author robert
 */
public class TestDAO {
    public static void main(String[] args) {
        ProdutoDAOImpl dao = new ProdutoDAOImpl();
        List<Produto> lista = dao.filterProductsByCategory("Celular");
        for(Produto p : lista){
            System.out.println("Categoria Celular : "+ p.getName());
        }
         List<Produto> lista2 = dao.filterProductsByName("Moto");
         for(Produto p : lista2){
            System.out.println("Nome Moto : "+ p.getName());
        }
         List<Produto> lista3 = dao.filterProductsByPrice(false);
         for(Produto p : lista3){
            System.out.println("Maior Preco: "+ p.getName());
        }
    }
   
}
