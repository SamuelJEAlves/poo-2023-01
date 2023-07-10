package com.github.samueljealves.ufg.poo.t18;

public class Bispo extends Peca{

    public Bispo() {
        super("Bispo");
    }

    @Override
    public void mover(Posicao origem, Posicao destino) {
        int deltaX = Math.abs(destino.getX() - origem.getX());
        int deltaY = Math.abs(destino.getY() - origem.getY());

        if (deltaX == deltaY) {
            //Movimento na diagonal
            System.out.println("Movimento válido: Mover na diagonal");
        } else {
            //Apenas o movimento anterior é válido para o Bispo
            System.out.println("Movimento inválido para o bispo");
        }
    }
}
