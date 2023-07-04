package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;

public class Empresa {

    private String nome;
    public ArrayList<Emprego> empregos;
    public ArrayList<Pessoa> pessoas;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregos = new ArrayList<Emprego>();
        this.pessoas = new ArrayList<Pessoa>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarEmprego(Emprego emprego){
        empregos.add(emprego);
    }

    public void removeEmprego(Emprego emprego){
        empregos.remove(emprego);
    }

    public ArrayList<Emprego> getEmpregos() {
        return empregos;
    }

    public void contratarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void demitirPessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
}
