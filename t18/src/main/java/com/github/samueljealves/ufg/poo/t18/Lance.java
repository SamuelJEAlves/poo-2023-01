package com.github.samueljealves.ufg.poo.t18;

public class Lance {

    private Jogador jogador;
    private Peca peca;
    private Posicao origem;
    private Posicao destino;

    private Partida partida;

    public Lance(Jogador jogador, Peca peca, Posicao origem, Posicao destino, Partida partida) {
        this.jogador = jogador;
        this.peca = peca;
        this.origem = origem;
        this.destino = destino;
        this.partida = partida;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Peca getPeca() {
        return peca;
    }

    public Posicao getOrigem() {
        return origem;
    }

    public Posicao getDestino() {
        return destino;
    }

    public Partida getPartida() {
        return partida;
    }
}
