package com.github.samueljealves.ufg.poo.t08;


public class Emprego {

    public double salario;
    public String intervaloTempo;

    public Emprego(double salario, String intervaloTempo) {
        this.salario = salario;
        this.intervaloTempo = intervaloTempo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getIntervaloTempo() {
        return intervaloTempo;
    }

    public void setIntervaloTempo(String intervaloTempo) {
        this.intervaloTempo = intervaloTempo;
    }
}
