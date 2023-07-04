package com.github.samueljealves.ufg.poo.t07;

import java.util.ArrayList;
import java.util.TreeSet;

public class Festa {

    private ArrayList <Convidado> convidados;

    public Festa() {
        this.convidados = new ArrayList<Convidado>();
    }

    public void novoConvidado(Convidado convidado){
        convidados.add(convidado);
    }

    public Festa(Convidado c){
        convidados.add(c);
    }
}