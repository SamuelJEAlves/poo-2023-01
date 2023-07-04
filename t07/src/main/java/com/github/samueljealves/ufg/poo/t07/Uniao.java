package com.github.samueljealves.ufg.poo.t07;

import java.util.List;
import java.util.Objects;


public class Uniao {

    private List<Pessoa> filhos;
    private Pessoa[] parceiros;
    public void novoFilho(Pessoa filho){
        filhos.add(filho);
    }

    public Uniao(Pessoa a, Pessoa b){
        parceiros = new Pessoa[] { a, b };
    }
}
