package com.github.samueljealves.ufg.poo.t09;

import java.util.ArrayList;
import java.util.List;

public class CaixeiroViajante {

    private List<Viagem> viagens;

    public CaixeiroViajante() {
        viagens = new ArrayList<Viagem>();
    }

    public void adicionarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    public List<Viagem> getViagens() {
        return viagens;
    }


}
