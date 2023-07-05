package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;
import java.util.List;

public class Texto {
    public List<Paragrafo> paragrafos;

    public Texto() {
        this.paragrafos = new ArrayList<Paragrafo>();
    }

    public void adicionarParagrafo(Paragrafo paragrafo) {
        paragrafos.add(paragrafo);
    }

    public void removerParagrafo(Paragrafo paragrafo){
        paragrafos.remove(paragrafo);
    }

    public List<Paragrafo> getParagrafos() {
        return paragrafos;
    }

}
