package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private Grupo grupo;

    private List<Diretorio> diretorios;

    public Usuario(String nome, Grupo grupo) {
        this.nome = nome;
        this.grupo = grupo;
        this.diretorios = new ArrayList<Diretorio>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void adicionarDiretorio(Diretorio diretorio){
        diretorios.add(diretorio);
    }

    public void removerDiretorio(Diretorio diretorio){
        diretorios.remove(diretorio);
    }

    public List<Diretorio> getDiretorios() {
        return diretorios;
    }
}
