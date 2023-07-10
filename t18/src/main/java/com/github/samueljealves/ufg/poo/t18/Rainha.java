package com.github.samueljealves.ufg.poo.t18;

public class Rainha extends Peca{

    public Rainha() {
        super("Rainha");
    }

    @Override
    public void mover(Posicao origem, Posicao destino) {
        int deltaX = Math.abs(destino.getX() - origem.getX());
        int deltaY = Math.abs(destino.getY() - origem.getY());

        if ((deltaX == deltaY) || (deltaX > 0 && deltaY == 0) || (deltaX == 0 && deltaY > 0)) {
            //Movimento em linha reta ou diagonal
            System.out.println("Movimento válido: Mover na diagonal, mesma fileira ou coluna");
        } else {
            //Apenas o movimento anterior é válido para a Rainha
            System.out.println("Movimento inválido para a rainha");
        }
    }
}
