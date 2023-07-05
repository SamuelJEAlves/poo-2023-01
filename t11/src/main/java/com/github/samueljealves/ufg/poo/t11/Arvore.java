package com.github.samueljealves.ufg.poo.t11;

import java.util.ArrayList;
import java.util.List;

public class Arvore {

    private List<Folha> folhas;

    public Arvore() {
        folhas = new ArrayList<Folha>();
    }

    public void adicionarFolha(Folha folha) {
        folhas.add(folha);
    }

    public List<Folha> getFolhas() {
        return folhas;
    }
}
