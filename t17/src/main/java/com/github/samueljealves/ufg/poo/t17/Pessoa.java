package com.github.samueljealves.ufg.poo.t17;

public class Pessoa {

    private String nome;
    private String sexo;

    private Automovel automovel;

    public Pessoa(String nome, String sexo, Automovel automovel) {
        this.nome = nome;
        this.sexo = sexo;
        this.automovel = automovel;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void dirigirAutomovel(){
        System.out.println("Dirigindo meu carro! Bibi bibi!");
    }
}

