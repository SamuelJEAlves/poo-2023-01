package com.github.samueljealves.ufg.poo.t09;

import java.util.ArrayList;

public class Viagem {

    private ArrayList<String> cidades;
    private ArrayList<Pedido> pedidos;

    public Viagem(ArrayList<String> cidades) {
        this.cidades = cidades;
        this.pedidos = new ArrayList<Pedido>();
    }

    public void adicionarPedido(Pedido pedido, Armazem armazem) {
        pedido.setViagem(this);
        pedido.setArmazem(armazem);
        pedidos.add(pedido);
    }

    public ArrayList<String> getCidades() {
        return cidades;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
