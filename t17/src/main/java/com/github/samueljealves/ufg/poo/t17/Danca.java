package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Danca {

    private String horaInicio;
    private String horaFim;

    private Musica musica;

    private List<Pessoa> pessoas;

    public Danca(String horaInicio, String horaFim, Musica musica) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.musica = musica;
        this.pessoas = new ArrayList<>();
    }
    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public Musica getMusica() {
        return musica;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
