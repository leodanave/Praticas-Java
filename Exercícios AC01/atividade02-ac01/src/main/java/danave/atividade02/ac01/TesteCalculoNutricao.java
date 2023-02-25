/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class TesteCalculoNutricao {

    public static void main(String[] args) {

        CalculoNutricao calc = new CalculoNutricao();

        Scanner leitor = new Scanner(System.in);

        Integer numeroDigitado;

        do {
            System.out.println("Bem vindo ao Cálculo de Nutrição!\n\n"
                    + "Para calcular o IMC: 1\n"
                    + "Para sair: 0");
            numeroDigitado = leitor.nextInt();

            if (!numeroDigitado.equals(0) && !numeroDigitado.equals(1)) {
                System.out.println("Digite um número entre 1 e 0\n");
            } else {
                switch (numeroDigitado) {
                    case 1:
                        System.out.println("Quantas pessoas vão calcular o IMC?");
                        Integer numeroPessoaDigitado = leitor.nextInt();
                        
                        for (int i = 1; i <= numeroPessoaDigitado; i++) {
                            System.out.println(String.format("\nDigite o peso "
                                    + "da pessoa %d", i));
                            Double pesoDigitado = leitor.nextDouble();
                            
                            System.out.println(String.format("\nDigite a altura "
                                    + "da pessoa %d", i));
                            Double alturaDigitada = leitor.nextDouble();
                            
                            System.out.println(String.format("O IMC da pessoa "
                                    + "%d é: %.2f\n" , i, calc.calcularIMC(pesoDigitado,
                                            alturaDigitada)));
                        }

                    case 0:
                        System.out.println("Obrigado por utilizar a calculadora!\n");
                        break;
                }
            }

        } while (!numeroDigitado.equals(0));

    }
}
