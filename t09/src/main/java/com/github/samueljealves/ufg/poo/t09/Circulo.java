package com.github.samueljealves.ufg.poo.t09;

public class Circulo {

    public Ponto centro;
    public int raio;

    public Circulo(int raio, Ponto centro) {
        this.raio = raio;
        this.centro = centro;
    }


    public int getRaio() {
        return raio;
    }

    public void transladar(int newX, int newY, Ponto ponto) {
        centro = new Ponto(newX, newY);
    }
}