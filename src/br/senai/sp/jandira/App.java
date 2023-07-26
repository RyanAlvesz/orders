package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Pedido;
import br.senai.sp.jandira.model.Produto;

public class App {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.descricao = "Vinil Folklore";
        p1.valor = 113.13;

        p2.descricao = "Vinil Evermore";
        p2.valor = 113.13;

        p3.descricao = "Vinil Midnights";
        p3.valor = 113.13;

        Cliente c1 = new Cliente();
        c1.nome = "Taylor Swift";
        c1.telefone = "11 4292-8922";
        c1.email = "taylor@email.com";

        Pedido ped1 = new Pedido();
        ped1.cliente = c1;
        ped1.numero = 1;
        ped1.total = 13.0;
        ped1.produtos.add(p1);
        ped1.produtos.add(p2);
        ped1.produtos.add(p3);

        ped1.mostrarPedido();

    }


}
