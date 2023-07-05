package com.github.samueljealves.ufg.poo.t11;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    private List<Garagem> garagens;
    private List<Sala> salas;
    private List<Area> areas;
    private List<Quarto> quartos;
    private List<Banheiro> banheiros;

    public Casa() {
        this.garagens = new ArrayList<Garagem>();
        this.salas = new ArrayList<Sala>();
        this.areas = new ArrayList<Area>();
        this.quartos = new ArrayList<Quarto>();
        this.banheiros = new ArrayList<Banheiro>();
    }

    public List<Garagem> getGaragens() {
        return garagens;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public List<Banheiro> getBanheiros() {
        return banheiros;
    }
}
