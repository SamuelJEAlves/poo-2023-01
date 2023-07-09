package com.github.samueljealves.ufg.poo.t17;

public class PlacaMae {

    private String marca;
    private String modelo;

    private CPU cpu;

    public PlacaMae(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void iniciarPlacaMae(){
        System.out.println("Placa mãe iniciada!");
    }

    public void conectarCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void processarDados() {
        if (cpu != null) {
            cpu.executar();
        } else {
            System.out.println("CPU não conectada à placa-mãe!");
        }
    }
}
