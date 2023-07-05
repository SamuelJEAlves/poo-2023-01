package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;
import java.util.List;

public class Curva {

    public List<Ponto> pontos;

    public Curva() {
        this.pontos = new ArrayList<Ponto>();
    }

    public void adicionarPonto(Ponto ponto){
        pontos.add(ponto);
    }

    public List<Ponto> getPontos() {
        return pontos;
    }

    public int quantidadePontos(){
        return pontos.size();
    }

    public boolean isCurva(){
        if(quantidadePontos() >= 2){
            return true;
        } else {
            return false;
        }
    }

}


