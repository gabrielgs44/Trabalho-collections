package control;

import org.apache.commons.collections4.map.MultiKeyMap;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Programa {

    public static void main(String[] args) {
        
        MultiKeyMap multiKey = new MultiKeyMap();
       
        String nome = "Bolo";
        float preco = (float) 2.00;
        int codProduto = 1;
        
        int codPedido = 1;
        String dtEntrega = "24/06/2019";
        
        Produto prod = new Produto(nome, preco, codProduto, null);
        Pedido ped = new Pedido(codPedido, dtEntrega);
        prod.addPedido(ped);
        ped.addProduto(prod);
        
        
        int qtd = 2;
        float valor = preco * qtd;
        
        ItemPedido itemPed = new ItemPedido(qtd, valor, prod, ped);
        
        multiKey.put(codProduto, codPedido, "codigos");
        
        System.out.println("Data do Pedido: " + ped.getDtPedido());
        System.out.println("Data da Entrega: " + ped.getDtEntrega());
        System.out.println("Produto Pedido: " + prod.getNome());
        System.out.println("Quantidade: " + itemPed.getQtd());
        System.out.println("Valor total: " + itemPed.getValor() + " R$");
        
    }

}
