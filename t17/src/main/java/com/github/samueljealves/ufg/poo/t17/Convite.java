package com.github.samueljealves.ufg.poo.t17;

import java.util.List;

public class Convite {

    private Pessoa convidado;
    private Pessoa acompanhante;

    public Convite(Pessoa convidado) {
        this.convidado = convidado;
    }

    public Pessoa getConvidado() {
        return convidado;
    }

    public Pessoa getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(Pessoa acompanhante) {
        this.acompanhante = acompanhante;
    }
}
