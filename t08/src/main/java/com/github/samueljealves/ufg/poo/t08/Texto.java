package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;

public class Texto {
    public ArrayList<Paragrafo> paragrafos;

    public Texto() {
        this.paragrafos = new ArrayList<Paragrafo>();
    }

    public void adicionarParagrafo(Paragrafo paragrafo) {
        paragrafos.add(paragrafo);
    }

    public void removerParagrafo(Paragrafo paragrafo){
        paragrafos.remove(paragrafo);
    }

    public ArrayList<Paragrafo> getParagrafos() {
        return paragrafos;
    }

}
