package com.github.samueljealves.ufg.poo.t11;

public class Funcionario {

    private String nome;
    private boolean gerente;

    public Funcionario(String nome, boolean gerente) {
        this.nome = nome;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public boolean isGerente() {
        return gerente;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + ", Gerente: " + gerente;
    }
}
