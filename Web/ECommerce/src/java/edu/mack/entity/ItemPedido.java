/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 31327291
 */
public class ItemPedido {

    private Produto product;
    private int quantity;
    private double totalPrice;

    public ItemPedido(Produto product,int quantity) {
        this.product = product;
    }

//    public void addProduct(int quantity) {
//        this.quantity++;
//        totalPrice += product.getPrice() * quantity;
//
//    }
//
//    public void removeProduct(int quantity) {
//        this.quantity--;
//        totalPrice -= product.getPrice() * quantity;
//    }
    public double getTotalPrice(){
        return totalPrice;
    }
}
