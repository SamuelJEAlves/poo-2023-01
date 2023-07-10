package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {

    private List<Operacao> operacoes;

    public Aeroporto() {
        this.operacoes = new ArrayList<>();
    }

    public List<Operacao> getOperacoes() {
        return operacoes;
    }

}
