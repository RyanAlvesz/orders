package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public int numero;
    public Cliente cliente;
    public double total;
    public List<Produto> produtos = new ArrayList<>();

    public void mostrarPedido(){
        System.out.println("---------------------");
        System.out.println("Pedido No." + numero);
        System.out.println("---------------------");
        System.out.println("Client: " + cliente.nome);
        System.out.println("Telefone: " + cliente.telefone);
        System.out.println("E-mail: " + cliente.email);
        System.out.println("---------------------");
        System.out.println("Itens do Pedido");
        for(Produto p : produtos){
            System.out.println("-" + p.descricao);
        }
        System.out.println("---------------------");
        System.out.println("Total: R$" + total);
        System.out.println("---------------------");
    }

}
