package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private List<Detalhe> detalhes;

    public Item() {
        this.detalhes = new ArrayList<>();
    }

    public List<Detalhe> getDetalhes() {
        return detalhes;
    }


}
