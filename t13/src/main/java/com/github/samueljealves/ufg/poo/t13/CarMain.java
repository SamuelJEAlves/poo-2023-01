package com.github.samueljealves.ufg.poo.t13;

public class CarMain {
    public static void main(String[] args) {

        Mechanic mechanic = null;

        Mechanic mechanic1 = new Mechanic("Tião", 63, "Volks");
        Car car1 = new Car("Fusca", "1976", 140, mechanic1);

        System.out.println("Nome do carro: " + car1.getCarName());
        System.out.println("Ano de fabricação: " + car1.getFabricationYear());
        System.out.println("Velocidade máxima: " + car1.getMaxSpeed());
        System.out.println("Mecânico responsável: " + car1.getMechanic());
        System.out.println("-------------------------");

        car1.editCarName("Kombi");
        System.out.println("Correção no nome do carro: " + car1.getCarName());

        mechanic1.editMechanicName("Roberval");
        System.out.println("Correção no nome do mecânico responsável: " + mechanic1.getMechanicName());

    }
}
