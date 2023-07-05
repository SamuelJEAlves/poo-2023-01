package com.github.samueljealves.ufg.poo.t11;

import java.util.ArrayList;

public class Arvore {

    private ArrayList<Folha> folhas;

    public Arvore() {
        folhas = new ArrayList<Folha>();
    }

    public void adicionarFolha(Folha folha) {
        folhas.add(folha);
    }

    public ArrayList<Folha> getFolhas() {
        return folhas;
    }
}
