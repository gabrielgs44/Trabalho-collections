package model;

import java.util.ArrayList;

public class Pedido {
    private int codigoPedido;
    private ArrayList<Produto> listaProduto;

    public Pedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
        this.listaProduto = new ArrayList<Produto>();
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public ArrayList<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(ArrayList<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public void addProduto(Produto produto) {
        listaProduto.add(produto);
    }

    public void removeProduto(Produto exProduto) {
        if (!listaProduto.contains(exProduto))
            return;
        else
            listaProduto.remove(exProduto);
    }
}
