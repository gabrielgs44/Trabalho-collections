package model;

import java.util.ArrayList;

public class Produto {
    private int codigoProduto;
    private ArrayList<Pedido> listaPedido;

    public Produto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
        this.listaPedido = new ArrayList<Pedido>();
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public ArrayList<Pedido> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(ArrayList<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    public void addPedido(Pedido Pedido) {
        listaPedido.add(Pedido);
    }

    public void removePedido(Pedido exPedido) {
        listaPedido.remove(exPedido);
    }
}
