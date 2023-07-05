package com.github.samueljealves.ufg.poo.t09;

import java.util.Scanner;

public class PontoTest {
        public static void main(String[] args) {


            Scanner teclado = new Scanner(System.in);

            Ponto ponto1 = new Ponto(3, 2);
            Circulo circulo1 = new Circulo(5, ponto1);


            System.out.println("Digite a nova coordenada x: ");
            int newX = teclado.nextInt();
            System.out.println("Digite a nova coordenada y: ");
            int newY = teclado.nextInt();

            circulo1.transladar(newX, newY, ponto1);
            ponto1.trasladar(newX, newY);
        }
    }

