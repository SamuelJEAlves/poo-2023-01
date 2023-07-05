package com.github.samueljealves.ufg.poo.t09;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Transacao> transacoes;

    public Cliente(String nome) {
        this.nome = nome;
        this.transacoes = new ArrayList<Transacao>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarTransacao(Transacao transacao){
        transacoes.add(transacao);
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
