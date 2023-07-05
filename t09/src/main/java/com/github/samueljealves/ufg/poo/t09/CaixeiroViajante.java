package com.github.samueljealves.ufg.poo.t09;

import java.util.ArrayList;

public class CaixeiroViajante {

    private ArrayList<Viagem> viagens;

    public CaixeiroViajante() {
        viagens = new ArrayList<Viagem>();
    }

    public void adicionarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    public ArrayList<Viagem> getViagens() {
        return viagens;
    }


}
