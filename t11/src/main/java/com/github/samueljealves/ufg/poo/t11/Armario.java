package com.github.samueljealves.ufg.poo.t11;

public class Armario {

    private Prateleira[] prateleiras;

    public Armario(int quantidadePrateleiras) {
        this.prateleiras = new Prateleira[quantidadePrateleiras];
    }

    public void adicionarPrateleira(Prateleira prateleira, int posicao) {
        prateleiras[posicao] = prateleira;
    }

    public void exibirConteudo() {
        for (int i = 0; i < prateleiras.length; i++) {
            System.out.println("Prateleira " + (i + 1) + ":");
            if (prateleiras[i] != null) {
                prateleiras[i].exibirConteudo();
            } else {
                System.out.println("Vazio");
            }
        }
    }
}
