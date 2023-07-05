package com.github.samueljealves.ufg.poo.t09;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    public String nome;
    public int idade;
    public List<Habito> habitos;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.habitos = new ArrayList<Habito>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void adicionarHabitos(Habito habito){
        habitos.add(habito);
    }

    public void removerHabitos(Habito habito){
        habitos.remove(habito);
    }

    public List<Habito> getHabitos() {
        return habitos;
    }
}
