package com.github.samueljealves.ufg.poo.t11;

import java.util.ArrayList;
import java.util.List;

public class Floresta {

    private List<Arvore> arvores;

    public Floresta() {
        arvores = new ArrayList<Arvore>();
    }

    public void adicionarArvore(Arvore arvore) {
        arvores.add(arvore);
    }

    public List<Arvore> getArvores() {
        return arvores;
    }
}
