package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;
    public List<Emprego> empregos;
    public List<Pessoa> pessoas;

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

    public List<Emprego> getEmpregos() {
        return empregos;
    }

    public void contratarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void demitirPessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
