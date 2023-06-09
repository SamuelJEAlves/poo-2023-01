package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;
import java.util.List;

public class Diretorio {

    private String nome;
    private Usuario dono;
    private List<Usuario> autorizados;

    public Diretorio(String nome, Usuario dono) {
        this.nome = nome;
        this.dono = dono;
        this.autorizados = new ArrayList<Usuario>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public void adicionarAutorizado(Usuario usuario){
        autorizados.add(usuario);
    }

    public void removerAutorizado(Usuario usuario){
        autorizados.remove(usuario);
    }

    public List<Usuario> getAutorizados() {
        return autorizados;
    }
}
