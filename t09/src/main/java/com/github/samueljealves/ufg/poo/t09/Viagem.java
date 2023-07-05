package com.github.samueljealves.ufg.poo.t09;

import java.util.ArrayList;
import java.util.List;

public class Viagem {

    private List<String> cidades;
    private List<Pedido> pedidos;

    public Viagem(ArrayList<String> cidades) {
        this.cidades = cidades;
        this.pedidos = new ArrayList<Pedido>();
    }

    public void adicionarPedido(Pedido pedido, Armazem armazem) {
        pedido.setViagem(this);
        pedido.setArmazem(armazem);
        pedidos.add(pedido);
    }

    public List<String> getCidades() {
        return cidades;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
