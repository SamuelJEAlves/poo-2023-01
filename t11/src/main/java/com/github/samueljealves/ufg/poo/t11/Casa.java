package com.github.samueljealves.ufg.poo.t11;

import java.util.ArrayList;

public class Casa {

    private ArrayList<Garagem> garagens;
    private ArrayList<Sala> salas;
    private ArrayList<Area> areas;
    private ArrayList<Quarto> quartos;
    private ArrayList<Banheiro> banheiros;

    public Casa() {
        this.garagens = new ArrayList<Garagem>();
        this.salas = new ArrayList<Sala>();
        this.areas = new ArrayList<Area>();
        this.quartos = new ArrayList<Quarto>();
        this.banheiros = new ArrayList<Banheiro>();
    }

    public ArrayList<Garagem> getGaragens() {
        return garagens;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public ArrayList<Banheiro> getBanheiros() {
        return banheiros;
    }
}
