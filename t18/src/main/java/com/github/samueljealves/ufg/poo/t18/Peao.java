package com.github.samueljealves.ufg.poo.t18;

public class Peao extends Peca{

    public Peao() {
        super("Peão");
    }

    @Override
    public void mover(Posicao origem, Posicao destino) {

        //X é coluna e Y é linha
        // (0,0) é o canto superior esquerdo

        int deltaX = Math.abs(destino.getX() - origem.getX());
        int deltaY = Math.abs(destino.getY() - origem.getY());

        if (deltaX == 1 && deltaY == 0) {
            //Se dX for 1 e dY for 0 significa que o peão ta andando pra frente
            System.out.println("Movimento válido: Avançar uma casa para frente");
        } else if (deltaX == 1 && deltaY == 1) {
            //Se dX for 1 e dY for 1 significa que o peão ta andando na diagonal
            System.out.println("Movimento válido: Capturar peça diagonalmente");
        } else {
            //Apenas os movimentos anteriores são válidos para o Peão
            System.out.println("Movimento inválido para o peão");
        }
    }
}
