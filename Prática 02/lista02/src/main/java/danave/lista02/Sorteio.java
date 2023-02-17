/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Leonardo
 */
public class Sorteio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número de 1 a 100");
        Integer numeroDigitado = leitor.nextInt();

        Integer numeroRandomico;
        int coincidencia = 0;
        int numeroPar = 0;
        int numeroImpar = 0;

        for (int i = 1; i <= 200; i++) {

            numeroRandomico = ThreadLocalRandom.current().nextInt(1, 100);

            if (coincidencia == 0) {
                if (numeroRandomico.equals(numeroDigitado)) {
                    coincidencia = i;
                    System.out.println(String.format("Seu número foi sorteado"
                            + " pela primeira vez no %dº sorteio!", coincidencia));
                }
            }

            if (numeroRandomico % 2 == 0) {
                numeroPar++;
            } else {
                numeroImpar++;
            }

        }

        System.out.println(String.format("Foram sorteados %d números pares"
                + " e %d números ímpares", numeroPar, numeroImpar));

    }

}
