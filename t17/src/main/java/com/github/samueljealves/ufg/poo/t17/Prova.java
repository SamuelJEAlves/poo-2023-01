package com.github.samueljealves.ufg.poo.t17;

import java.util.List;

public class Prova {

    private List<Resposta> respostas;

    public Prova(List<Resposta> respostas) {
        this.respostas = respostas;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void adicionarResposta(Resposta resposta){
        respostas.add(resposta);
    }

    public void removerResposta(Resposta resposta){
        respostas.remove(resposta);
    }
}
