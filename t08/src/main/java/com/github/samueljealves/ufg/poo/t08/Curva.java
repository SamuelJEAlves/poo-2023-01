package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;

public class Curva {

    public ArrayList<Ponto> pontos;

    public Curva() {
        this.pontos = new ArrayList<Ponto>();
    }

    public void adicionarPonto(Ponto ponto){
        pontos.add(ponto);
    }

    public ArrayList<Ponto> getPontos() {
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


