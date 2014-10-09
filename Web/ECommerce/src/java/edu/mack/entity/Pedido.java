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
public class Pedido {

    private List<ItemPedido> cart;
    private double totalPrice;

    public Pedido() {
        cart = new ArrayList<ItemPedido>();
    }

    public void addItemList(ItemPedido item) {
        cart.add(item);
        totalPrice += item.getTotalPrice();
    }

    public void removeItemList(ItemPedido item) {
        if (cart.contains(item)) {
            cart.remove(item);
            totalPrice -= item.getTotalPrice();
        }

    }
}
