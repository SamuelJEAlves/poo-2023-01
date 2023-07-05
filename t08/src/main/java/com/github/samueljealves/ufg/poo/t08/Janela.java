package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;
import java.util.List;

public class Janela {
    public List<ElementoInteracao> elementoInteracoes;

    public Janela() {
        this.elementoInteracoes = new ArrayList<ElementoInteracao>();
    }

    public void adicionarElementoInteracao(ElementoInteracao elementoInteracao) {
        elementoInteracoes.add(elementoInteracao);
    }

    public void removerElemento(ElementoInteracao elementoInteracao) {
        elementoInteracoes.remove(elementoInteracao);
    }
}

