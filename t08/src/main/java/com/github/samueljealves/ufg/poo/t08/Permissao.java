package com.github.samueljealves.ufg.poo.t08;


public class Permissao {

    private Grupo grupo;
    private String descricao;
    private Arquivo arquivo;

    public Permissao(Grupo grupo, String descricao, Arquivo arquivo) {
        this.grupo = grupo;
        this.descricao = descricao;
        this.arquivo = arquivo;
    }
    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }
}
