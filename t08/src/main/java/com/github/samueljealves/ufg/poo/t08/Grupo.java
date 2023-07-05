package com.github.samueljealves.ufg.poo.t08;


import java.util.ArrayList;
import java.util.List;

public class Grupo {

    public List<Permissao> permissoes;
    private String nome;
    public List<Usuario> usuarios;

    public Grupo(String nome) {
        this.permissoes = new ArrayList<Permissao>();
        this.nome = nome;
        this.usuarios = new ArrayList<Usuario>();
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

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

}
