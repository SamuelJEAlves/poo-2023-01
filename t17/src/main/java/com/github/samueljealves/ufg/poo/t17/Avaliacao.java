package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Avaliacao {

    private List<Questao> questoes;
    private List<Prova> provas;

    public Avaliacao() {
        this.questoes = new ArrayList<>();
        this.provas = new ArrayList<>();
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public List<Prova> getProvas() {
        return provas;
    }

    public void adicionarQuestao(Questao questao) {
        questoes.add(questao);
    }

    public void removerQuestao(Questao questao) {
        questoes.remove(questao);
    }
}
