package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Aviao {

    private List<Voo> voos;
    private List<Lugar> lugares;

    public Aviao(List<Lugar> lugares) {
        this.voos = new ArrayList<>();
        this.lugares =  lugares;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void adicionarVoo(Voo voo){
        voos.add(voo);
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void adicionarLugar(Lugar lugar) {
        lugares.add(lugar);
    }

    public void removerLugar(Lugar lugar) {
        lugares.remove(lugar);
    }
}
