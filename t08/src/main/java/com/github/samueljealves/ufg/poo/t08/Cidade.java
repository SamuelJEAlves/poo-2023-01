package com.github.samueljealves.ufg.poo.t08;


public class Cidade {

    private String name;
    private int population;


    public Pais pais;
    public Cidade(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
