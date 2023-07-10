package com.github.samueljealves.ufg.poo.t17;

public class Voo {

    private String numeroVoo;
    private Tripulacao tripulacao;

    private Aviao aviao;

    public Voo(String numeroVoo, Tripulacao tripulacao, Aviao aviao) {
        this.numeroVoo = numeroVoo;
        this.tripulacao = tripulacao;
        this.aviao = aviao;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public Tripulacao getTripulacao() {
        return tripulacao;
    }

    public Aviao getAviao() {
        return aviao;
    }
}
