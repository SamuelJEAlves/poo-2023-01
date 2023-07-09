package com.github.samueljealves.ufg.poo.t17;

public class ComputadorMain {
    public static void main(String[] args) {

        Teclado teclado1 = new Teclado("Razer", "1");
        Mouse mouse1 = new Mouse("Razer", "2");
        PlacaMae placaMae1 = new PlacaMae("Asus", "3");
        Computador computador1 = new Computador(teclado1, mouse1, placaMae1);

        computador1.getPlacaMae().iniciarPlacaMae();
        computador1.iniciarComputador();
        computador1.getMouse().iniciarMouse();
        computador1.getTeclado().iniciarTeclado();

        CPU cpu1 = new CPU(placaMae1);
        Memoria memoria1 = new Memoria("3200", "8GB");

        placaMae1.conectarCPU(cpu1);
        cpu1.conectarMemoria(memoria1);
        placaMae1.processarDados();
    }
}
