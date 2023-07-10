package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private List<Prova> provas;

    public Aluno() {
        this.provas = new ArrayList<>();
    }

    public List<Prova> getProvas() {
        return provas;
    }
}
