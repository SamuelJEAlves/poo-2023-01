package com.github.samueljealves.ufg.poo.t09;

import java.util.ArrayList;
import java.util.List;

public class Conteiner extends Elemento{

    public List<Elemento> elementos;

    public Conteiner() {
        this.elementos = new ArrayList<Elemento>();
    }

    public void adicionarElementos(Elemento elemento){
        elementos.add(elemento);
    }

    public void removerElementos(Elemento elemento){
        elementos.remove(elemento);
    }
    public List<Elemento> getElementos() {
        return elementos;
    }
}
