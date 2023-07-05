package com.github.samueljealves.ufg.poo.t07;

import java.util.ArrayList;
import java.util.List;

public class Religiao {

    private List<Devoto> devotos;

    public Religiao() {
        this.devotos = new ArrayList<Devoto>();
    }

    public void novoDevoto(Devoto devoto){
        devotos.add(devoto);

    }
}
