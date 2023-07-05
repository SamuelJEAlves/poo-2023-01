package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;
import java.util.List;

public class Paragrafo {

    public List<Sentenca> sentencas;

    public Paragrafo() {
        this.sentencas = new ArrayList<Sentenca>();
    }

    public void adicionarSentenca(Sentenca sentenca){
        sentencas.add(sentenca);
    }

    public void removerSentenca(Sentenca sentenca){ sentencas.remove(sentenca); }

    public List<Sentenca> getSentencas() {
        return sentencas;
    }

}
