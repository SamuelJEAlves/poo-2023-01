package com.github.samueljealves.ufg.poo.t08;

public class BarraRolagem extends ElementoInteracao{

    public String nome;
    public BarraRolagem(String nome, String nome1) {
        super(nome);
        this.nome = nome1;
    }

    public String getNome() {
        return nome;
    }

}
