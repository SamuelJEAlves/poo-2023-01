package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private List<Detalhe> detalhes;

    private int quantidade;
    private float precoUnitario;

    public Item(int quantidade, float precoUnitario) {
        this.detalhes = new ArrayList<>();
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public List<Detalhe> getDetalhes() {
        return detalhes;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }
}
