package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;
import java.util.List;

public class Projeto {

    public List<Pessoa> pessoas;
    public List<Linguagem> linguagens;
    private String name;

    public Projeto(String name) {
        this.pessoas = new ArrayList<Pessoa>();
        this.linguagens = new ArrayList<Linguagem>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void adicionarLinguagens(Linguagem linguagem){
        linguagens.add(linguagem);
    }

    public List<Linguagem> getLinguagens() {
        return linguagens;
    }
}
