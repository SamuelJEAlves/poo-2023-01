package com.github.samueljealves.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Festa {

    private List<Convite> convites;

    public Festa() {
        this.convites = new ArrayList<>();
    }

    public List<Convite> getConvites() {
        return convites;
    }

    public void adicionarConvite(Convite convite){
        convites.add(convite);
    }

    public void removerConvite(Convite convite){
        convites.remove(convite);
    }
}
