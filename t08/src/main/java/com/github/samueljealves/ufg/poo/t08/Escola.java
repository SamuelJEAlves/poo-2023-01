package com.github.samueljealves.ufg.poo.t08;


public class Escola {

    private String name;
    private int studentsCapacity;
    private Endereco endereco;

    public Escola(String name, int studentsCapacity, Endereco endereco) {
        this.name = name;
        this.studentsCapacity = studentsCapacity;
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentsCapacity() {
        return studentsCapacity;
    }

    public void setStudentsCapacity(int studentsCapacity) {
        this.studentsCapacity = studentsCapacity;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
