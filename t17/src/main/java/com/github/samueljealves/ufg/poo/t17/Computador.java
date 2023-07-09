package com.github.samueljealves.ufg.poo.t17;

public class Computador {

    private Teclado teclado;
    private Mouse mouse;
    private PlacaMae placaMae;

    public Computador(Teclado teclado, Mouse mouse, PlacaMae placaMae) {
        this.teclado = teclado;
        this.mouse = mouse;
        this.placaMae = placaMae;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void iniciarComputador(){
        System.out.println("Computador iniciado!");
    }

}
