package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;

public class Paragrafo {

    public ArrayList<Sentenca> sentencas;

    public Paragrafo() {
        this.sentencas = new ArrayList<Sentenca>();
    }

    public void adicionarSentenca(Sentenca sentenca){
        sentencas.add(sentenca);
    }

    public void removerSentenca(Sentenca sentenca){ sentencas.remove(sentenca); }

    public ArrayList<Sentenca> getSentencas() {
        return sentencas;
    }

}
