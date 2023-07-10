package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Operacao {

    private String tipo;
    private String data;
    private String hora;

    private List<Voo> voos;

    public Operacao(String tipo, String data, String hora) {
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        this.voos = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void adicionarVoo(Voo voo) {
        voos.add(voo);
    }

    public void removerVoo(Voo voo) {
        voos.remove(voo);
    }
}
