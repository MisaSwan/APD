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

//  
    public double getTotalPrice(){
        return product.getPrice() * quantity ;
    }

    public Produto getProduct() {
        return product;
    }

    public void setProduct(Produto product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
