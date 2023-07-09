package com.github.samueljealves.ufg.poo.t17;

public class Teclado extends Dispositivo{

    private String marca;
    private String modelo;

    public Teclado(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void iniciarTeclado(){
        System.out.println("Teclado iniciado!");
    }
}
