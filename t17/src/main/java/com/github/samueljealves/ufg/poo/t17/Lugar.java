package com.github.samueljealves.ufg.poo.t17;

public class Lugar {

    private String identificadorPoltrona;
    private Passageiro passageiro;

    public Lugar(String identificadorPoltrona, Passageiro passageiro) {
        this.identificadorPoltrona = identificadorPoltrona;
        this.passageiro = passageiro;
    }

    public String getIdentificadorPoltrona() {
        return identificadorPoltrona;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
}
