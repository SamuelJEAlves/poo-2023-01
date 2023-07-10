package com.github.samueljealves.ufg.poo.t17;

public class Trabalhador {

    private String nome;
    private Profissao profissao;

    public Trabalhador(String nome, Profissao profissao) {
        this.nome = nome;
        this.profissao = profissao;
    }

    public Profissao getProfissao() {
        return profissao;
    }
}
