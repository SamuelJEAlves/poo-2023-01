package com.github.samueljealves.ufg.poo.t17;

public class Detalhe {

    private String descricao;
    private String acompanhamento;

    public Detalhe(String descricao, String acompanhamento) {
        this.descricao = descricao;
        this.acompanhamento = acompanhamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
}
