package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {

    private List<Sanduiche> sanduiches;

    public Lanchonete() {
        this.sanduiches = new ArrayList<>();
    }

    public List<Sanduiche> getSanduiches() {
        return sanduiches;
    }

    public void adicionarSanduiche(Sanduiche sanduiche){
        sanduiches.add(sanduiche);
    }

    public void removerSanduiche(Sanduiche sanduiche){
        sanduiches.remove(sanduiche);
    }
}
