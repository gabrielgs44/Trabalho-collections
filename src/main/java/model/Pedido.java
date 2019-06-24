package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Pedido {
    private int codigoPedido;
    private String dtPedido;
    private String dtEntrega;
    private ArrayList<Produto> listaProduto;
    
    public Pedido(int codigoPedido, String dtEntrega) {
        this.codigoPedido = codigoPedido;
        this.dtEntrega = dtEntrega;
        this.listaProduto = new ArrayList<Produto>();
        
        Calendar cal = Calendar.getInstance();
        
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH)+1;
        int ano = cal.get(Calendar.YEAR);
        
        dtPedido = dia + "/" + mes + "/" + ano;
    }
    
    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(String dtPedido) {
        this.dtPedido = dtPedido;
    }

    public String getDtEntrega() {
        return dtEntrega;
    }

    public void setDtEntrega(String dtEntrega) {
        this.dtEntrega = dtEntrega;
    }

    public ArrayList<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(ArrayList<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
    
    public void addProduto(Produto novoProduto) {
        listaProduto.add(novoProduto);
    }
    
    public void removeProduto(Produto exProduto) {
        if (!listaProduto.contains(exProduto))
            return;
        else
            listaProduto.remove(exProduto);
    }
}
