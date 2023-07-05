package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    public String nome;

    public List<Projeto> projetos;

    public List<Emprego> empregos;

    public List<Permissao> permissoes;

    public Pessoa(String nome) {
        this.empregos = new ArrayList<Emprego>();
        this.permissoes = new ArrayList<Permissao>();
        this.projetos = new ArrayList<Projeto>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarProjeto(Projeto projeto){
        projetos.add(projeto);
    }

    public void removerProjeto(Projeto projeto){
        projetos.remove(projeto);
    }

    public void adicionarEmprego(Emprego emprego){
        empregos.add(emprego);
    }

    public void removerEmprego(Emprego emprego){
        empregos.remove(emprego);
    }

    public void adicionarPermissao(Permissao permissao){
        permissoes.add(permissao);
    }

    public void removerPermissao(Permissao permissao){
        permissoes.add(permissao);
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public List<Emprego> getEmpregos() {
        return empregos;
    }

    public List<Permissao> getPermissoes() {
        return permissoes;
    }
}
