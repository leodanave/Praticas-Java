/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.atividade01.ac01;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Desafio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer operacaoDesejada;
        Integer numeroInteiro;

        do {
            System.out.println("Digite o número correspondente a operação desejada:"
                    + "\n\n1 - Soma\n"
                    + "2 - Multiplicação\n"
                    + "3 - Divisão\n"
                    + "4 - Subtração\n"
                    + "5 - Potência\n"
                    + "6 - Resto\n"
                    + "0 - Sair\n");
            operacaoDesejada = leitor.nextInt();

            if (operacaoDesejada == 0) {
                break;
            } else if (operacaoDesejada < 0 || operacaoDesejada > 6) {
                System.out.println("Opção inválida, tente novamente!\n");
            } else {
                System.out.println("Digite um número inteiro");
                numeroInteiro = leitor.nextInt();

                Integer potenciaNumero = numeroInteiro;
                
                for (int i = 1; i <= 10; i++) {

                    switch (operacaoDesejada) {
                        case 1:
                            Integer somaNumero = numeroInteiro + i;
                            System.out.println(String.format(
                                    "%d + %d = %d", numeroInteiro, i, somaNumero));
                            break;
                        case 2:
                            Integer multiplicacaoNumero = numeroInteiro * i;
                            System.out.println(String.format(
                                    "%d * %d = %d", numeroInteiro, i, multiplicacaoNumero));
                            break;
                        case 3:
                            Integer divisaoNumero = numeroInteiro / i;
                            System.out.println(String.format(
                                    "%d / %d = %d", numeroInteiro, i, divisaoNumero));
                            break;
                        case 4:
                            Integer subtracaoNumero = numeroInteiro - i;
                            System.out.println(String.format(
                                    "%d - %d = %d", numeroInteiro, i, subtracaoNumero));
                        case 5:
                                System.out.println(String.format("%d**%d = %d",
                                        numeroInteiro,i,potenciaNumero));
                                potenciaNumero *= numeroInteiro;
                                break;
                        case 6:
                            Integer restoNumero = numeroInteiro % i;
                            System.out.println(String.format(
                                    "%d / %d: O resto é %d", 
                                    numeroInteiro, i, restoNumero));
                    }
                    
                    

                }

            }

        } while (operacaoDesejada != 0);

        System.out.println("Até logo!");

    }

}