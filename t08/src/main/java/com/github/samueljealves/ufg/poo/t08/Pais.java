package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;
import java.util.List;

public class Pais {

    public List<Cidade> cidades;
    public Cidade capital;


    public Pais() {
        this.cidades = new ArrayList<Cidade>();
    }

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public List<Cidade> getCidades() {
        return cidades;
    }
    public Cidade getCapital() {
        return capital;
    }

    public void setCapital(Cidade capital) {
        this.capital = capital;
    }
}
