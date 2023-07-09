package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Computador {

    private List<Dispositivo> dispositivos;
    private Teclado teclado;
    private Mouse mouse;
    private PlacaMae placaMae;

    public Computador(Teclado teclado, Mouse mouse, PlacaMae placaMae) {
        this.teclado = teclado;
        this.mouse = mouse;
        this.placaMae = placaMae;
        this.dispositivos = new ArrayList<>();
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
