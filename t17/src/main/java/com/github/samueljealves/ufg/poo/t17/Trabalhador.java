package com.github.samueljealves.ufg.poo.t17;

public class Trabalhador {

    private String nome;
    private Profissao profissao;

    private Tarefa tarefa;

    public Trabalhador(String nome, Profissao profissao, Tarefa tarefa) {
        this.nome = nome;
        this.profissao = profissao;
        this.tarefa = tarefa;
    }

    public Profissao getProfissao() {
        return profissao;
    }
}
