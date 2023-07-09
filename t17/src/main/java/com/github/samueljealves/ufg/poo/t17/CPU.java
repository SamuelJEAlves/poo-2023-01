package com.github.samueljealves.ufg.poo.t17;

public class CPU extends Dispositivo{

    private Memoria memoria;
    private PlacaMae placaMae;

    public CPU(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public void conectarMemoria(Memoria memoria){
        this.memoria = memoria;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void executar() {
        if (memoria != null) {
            memoria.armazenarDados();
            System.out.println("CPU executando!");
        } else {
            System.out.println("Memória não conectada à CPU!");
        }
    }
}
