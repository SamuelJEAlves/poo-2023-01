package com.github.samueljealves.ufg.poo.t08;


public class Botao extends ElementoInteracao{

    public String nome;

    public Botao(String nome, String nome1) {
        super(nome);
        this.nome = nome1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
