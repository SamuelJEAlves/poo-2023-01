package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;

public class Pais {

    public ArrayList<Cidade> cidades;
    public Cidade capital;


    public Pais() {
        this.cidades = new ArrayList<Cidade>();
    }

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }
    public Cidade getCapital() {
        return capital;
    }

    public void setCapital(Cidade capital) {
        this.capital = capital;
    }
}
