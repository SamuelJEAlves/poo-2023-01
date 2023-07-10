package com.github.samueljealves.ufg.poo.t17;

public class Passageiro {

    private String nome;
    private String bilhete;

    public Passageiro(String nome, String bilhete) {
        this.nome = nome;
        this.bilhete = bilhete;
    }

    public String getNome() {
        return nome;
    }

    public String getBilhete() {
        return bilhete;
    }
}
