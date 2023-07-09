package com.github.samueljealves.ufg.poo.t13;

public class Car {

    private String carName;
    private String fabricationYear;
    private int maxSpeed;

    private Mechanic mechanic;

    public Car(String carName, String fabricationYear, int maxSpeed, Mechanic mechanic) {
        this.carName = carName;
        this.fabricationYear = fabricationYear;
        this.maxSpeed = maxSpeed;
        this.mechanic = mechanic;
    }

    public String getCarName() {
        return carName;
    }

    public String editCarName(String carName){
        this.carName = carName;
        return carName;
    }

    public String getFabricationYear() {
        return fabricationYear;
    }

    public void editFabricationYear(String fabricationYear){
        this.fabricationYear = fabricationYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void editMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public String getMechanic() {
        return mechanic.getMechanicName();
    }
}
