package com.github.samueljealves.ufg.poo.t09;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {

    private String nome;
    private List<Transacao> transacoes;

    public Fornecedor(String nome) {
        this.nome = nome;
        this.transacoes = new ArrayList<Transacao>();
    }
}
