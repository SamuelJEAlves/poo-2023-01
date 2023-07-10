package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Comite {

    private List<Pessoa> pessoas;
    private List<Pessoa> presidentes;

    public Comite() {
        this.pessoas = new ArrayList<>();
        this.presidentes = new ArrayList<>();
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }

    public List<Pessoa> getPresidentes() {
        return presidentes;
    }

    public void adicionarPresidente(Pessoa pessoa){
        presidentes.add(pessoa);
    }

    public void removerPresidente(Pessoa pessoa){
        presidentes.remove(pessoa);
    }
}