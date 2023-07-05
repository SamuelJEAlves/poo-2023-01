package com.github.samueljealves.ufg.poo.t11;

public class Prateleira {

    private Compartimento[] compartimentos;

    public Prateleira(int quantidadeCompartimentos) {
        this.compartimentos = new Compartimento[quantidadeCompartimentos];
    }

    public void adicionarCompartimento(Compartimento compartimento, int posicao) {
        compartimentos[posicao] = compartimento;
    }

    public void exibirConteudo() {
        for (int i = 0; i < compartimentos.length; i++) {
            System.out.println("Compartimento " + (i + 1) + ":");
            if (compartimentos[i] != null) {
                compartimentos[i].exibirConteudo();
            } else {
                System.out.println("Vazio");
            }
        }
    }
}
