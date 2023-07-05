package com.github.samueljealves.ufg.poo.t09;

public class Pedido {

    private String descricao;
    private Viagem viagem;
    private Armazem armazem;

    public Pedido(String descricao) {
        this.descricao = descricao;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public Armazem getArmazem() {
        return armazem;
    }

    public String getDescricao() {
        return descricao;
    }
}
