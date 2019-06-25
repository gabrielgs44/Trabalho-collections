package control;

import org.apache.commons.collections4.map.MultiKeyMap;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Programa {

    public static void main(String[] args) {
        
        MultiKeyMap itensPedidos = new MultiKeyMap();
       
        //Produto
        
        Produto prod1 = new Produto("Bolo", (float) 1.50, 1);
        Produto prod2 = new Produto("Suco de laranja", (float) 1.0, 2);
        
        //Pedido
        
        Pedido ped1 = new Pedido(1, "26/06/2019");
        
        prod1.addPedido(ped1);
        prod2.addPedido(ped1);
        ped1.addProduto(prod1);
        ped1.addProduto(prod2);
        
        //ItemPedido
        
        ItemPedido itemPed1 = new ItemPedido(2, 2 * prod1.getPreco(),prod1, ped1);
        ItemPedido itemPed2 = new ItemPedido(3, 3 * prod2.getPreco(), prod2, ped1);
        
        itensPedidos.put(ped1, prod1, "Pedido " + ped1 + " com o produto " + prod1.getNome());
        itensPedidos.put(ped1, prod2, "Pedido " + ped1 + " com o produto " + prod2.getNome());
        
        System.out.println("-----PEDIDO-----");
        System.out.println("codigo: " + ped1.getCodigoPedido());
        System.out.println("Data do Pedido: " + ped1.getDtPedido());
        System.out.println("Data da Entrega: " + ped1.getDtEntrega());
        
        int i = 1;
        
        for (Produto prodTemp : ped1.getListaProduto()) {
            System.out.println("Produto Pedido: " + prodTemp.getNome());
            System.out.println("Preço Unitário: R$ " + prodTemp.getPreco());
            if(i==1)
                System.out.println("Quantidade: " + itemPed1.getQtd());
            else
                System.out.println("Quantidade: " + itemPed2.getQtd());
            
            i++;       
        }
        float valorTotal = itemPed1.getValor() + itemPed2.getValor();
        System.out.println("Valor Total: R$ " + valorTotal);
    }

}
