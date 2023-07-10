package com.github.samueljealves.ufg.poo.t18;

import java.util.ArrayList;
import java.util.List;

public class Partida {

    private List<Lance> lances;
    private String descricao;

    private Tabuleiro tabuleiro;

    public Partida(String descricao, Tabuleiro tabuleiro) {
        this.descricao = descricao;
        this.lances = new ArrayList<>();
        this.tabuleiro = tabuleiro;
    }

    public void adicionarLance(Lance lance) {
        lances.add(lance);
    }

    public List<Lance> getLances() {
        return lances;
    }

    public String getDescricao() {
        return descricao;
    }
}
