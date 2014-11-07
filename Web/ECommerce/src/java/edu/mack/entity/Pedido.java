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

    private Endereco end;
//    private List<ItemPedido> cart;
    private Produto prod;
    private double qtdProduto;
    private int numeroPedido;
    public Pedido(Endereco end, Produto prod, double qtdProduto,int numeroPedido) {
        this.end = end;
        this.prod = prod;
        this.numeroPedido=numeroPedido;
        this.qtdProduto = qtdProduto;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    
    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public double getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(double qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getTotalPrice() {
        return getProd().getPrice() * getQtdProduto();
    }
}
