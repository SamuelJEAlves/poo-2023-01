package com.github.samueljealves.ufg.poo.t18;

public class Rei extends Peca{

    public Rei() {
        super("Rei");
    }

    @Override
    public void mover(Posicao origem, Posicao destino) {
        int deltaX = Math.abs(destino.getX() - origem.getX());
        int deltaY = Math.abs(destino.getY() - origem.getY());

        if ((deltaX == 1 && deltaY == 0) || (deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 1)) {
            //Movimento para uma casa adjacente
            System.out.println("Movimento válido: Mover para uma casa adjacente");
        } else {
            //Apenas o movimento anterior é válido para o Rei
            System.out.println("Movimento inválido para o rei");
        }
    }
}
