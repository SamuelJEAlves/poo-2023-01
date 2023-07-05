package com.github.samueljealves.ufg.poo.t11;

import java.util.ArrayList;

public class Floresta {

    private ArrayList<Arvore> arvores;

    public Floresta() {
        arvores = new ArrayList<Arvore>();
    }

    public void adicionarArvore(Arvore arvore) {
        arvores.add(arvore);
    }

    public ArrayList<Arvore> getArvores() {
        return arvores;
    }
}
