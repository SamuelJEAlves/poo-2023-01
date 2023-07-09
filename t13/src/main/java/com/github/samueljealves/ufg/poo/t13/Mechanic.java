package com.github.samueljealves.ufg.poo.t13;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {

    private String mechanicName;
    private int mechanicAge;
    private String mechanicSpeciality;
    public Mechanic(String mechanicName, int mechanicAge, String mechanicSpeciality) {
        this.mechanicName = mechanicName;
        this.mechanicAge = mechanicAge;
        this.mechanicSpeciality = mechanicSpeciality;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public String editMechanicName(String mechanicName){
        this.mechanicName = mechanicName;
        return mechanicName;
    }

    public int getMechanicAge() {
        return mechanicAge;
    }

    public void editMechanicAge(int mechanicAge){
        this.mechanicAge = mechanicAge;
    }

    public String getMechanicSpeciality() {
        return mechanicSpeciality;
    }

    public void editMechanicSpeciality(String mechanicSpeciality){
        this.mechanicSpeciality = mechanicSpeciality;
    }
}
