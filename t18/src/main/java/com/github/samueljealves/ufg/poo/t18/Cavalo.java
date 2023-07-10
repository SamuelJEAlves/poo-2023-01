package com.github.samueljealves.ufg.poo.t18;

public class Cavalo extends Peca{

    public Cavalo() {
        super("Cavalo");
    }

    @Override
    public void mover(Posicao origem, Posicao destino) {
        int deltaX = Math.abs(destino.getX() - origem.getX());
        int deltaY = Math.abs(destino.getY() - origem.getY());

        if ((deltaX == 1 && deltaY == 2) || (deltaX == 2 && deltaY == 1)) {
            //Movimento em L, duas casas em uma direção e uma em outra
            System.out.println("Movimento válido: Mover em L");
        } else {
            //Apenas o movimento anterior é válido para o cavalo
            System.out.println("Movimento inválido para o cavalo");
        }
    }
}
