package com.github.samueljealves.ufg.poo.t08;


public class Endereco {

    private int CEP;
    private String logradouro;

    public Endereco(int CEP, String logradouro) {
        this.CEP = CEP;
        this.logradouro = logradouro;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
