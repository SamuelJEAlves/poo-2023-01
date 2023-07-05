package com.github.samueljealves.ufg.poo.t08;

import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    public List<Permissao> permissoes;
    private String nome;

    public Arquivo(String nome) {
        this.permissoes = new ArrayList<Permissao>();
        this.nome = nome;
    }

    public void adicionarPermissao(Permissao permissao){
        permissoes.add(permissao);
    }

    public void removerPermissao(Permissao permissao){
        permissoes.add(permissao);
    }

    public List<Permissao> getPermissoes() {
        return permissoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
