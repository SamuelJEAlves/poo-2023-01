package com.github.samueljealves.ufg.poo.t18;

public abstract class Peca {

    private String nome;

    public Peca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public abstract void mover(Posicao origem, Posicao destino);
}
