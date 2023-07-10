package com.github.samueljealves.ufg.poo.t18;

public class Torre extends Peca{

    public Torre() {
        super("Torre");
    }

    @Override
    public void mover(Posicao origem, Posicao destino) {
        int deltaX = Math.abs(destino.getX() - origem.getX());
        int deltaY = Math.abs(destino.getY() - origem.getY());

        if ((deltaX > 0 && deltaY == 0) || (deltaX == 0 && deltaY > 0)) {
            //Movimento na mesma fileira ou coluna
            System.out.println("Movimento válido: Mover na mesma fileira ou coluna");
        } else {
            //Apenas o movimento anterior é válido para a Torre
            System.out.println("Movimento inválido para a torre");
        }
    }
}
