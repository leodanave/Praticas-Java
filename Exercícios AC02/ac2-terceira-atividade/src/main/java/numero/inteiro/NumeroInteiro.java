/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero.inteiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author leodanave
 */
public class NumeroInteiro {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Integer> numerosInteiros = new ArrayList();

        System.out.println("""
        --------------------------------------
        Digite números inteiros para serem
             adicionados em uma lista:
        --------------------------------------
        !!! Para acabar a lista, digite 0 !!! 
        --------------------------------------""");

        Integer numeroDigitado;

        do {
            numeroDigitado = leitor.nextInt();
            if (numeroDigitado != 0) {
                Boolean temNumeroIgual = false;
                for (int i = 0; i < numerosInteiros.size(); i++) {
                    Integer numeroAtual = numerosInteiros.get(i);
                    
                    if (numeroDigitado.equals(numeroAtual)) {
                        temNumeroIgual = true;
                    }
                }
                
                if (!temNumeroIgual) {
                numerosInteiros.add(numeroDigitado);
                    
                System.out.println("Digite o próximo número:");
                } else {
                    System.out.println("Este número já tem na lista, digite outro");
                }
            }
        } while (numeroDigitado != 0);

        if (!numerosInteiros.isEmpty()) {

            Integer somaDeTodosOsNumeros = 0;
            
            System.out.println("Números pares");
            for (Integer numeroInteiro : numerosInteiros) {
                if (numeroInteiro % 2 == 0) {
                    System.out.println(numeroInteiro + " ");
                }
            }

            System.out.println("\nNúmeros ímpares");
            for (Integer numeroInteiro : numerosInteiros) {
                if (numeroInteiro % 2 != 0) {
                    System.out.println(numeroInteiro + " ");
                }
            }

            Integer menorNumero = numerosInteiros.get(0);

            for (int i = 0; i < numerosInteiros.size(); i++) {
                Integer numeroAtual = numerosInteiros.get(i);
                
                somaDeTodosOsNumeros += numeroAtual;

                if (i > 0) {
                    if (numeroAtual < menorNumero) {
                        menorNumero = numeroAtual;
                    }
                }
            }

            System.out.println(String.format("\nO menor número da lista é %d", menorNumero));

            Integer maiorNumero = numerosInteiros.get(0);

            for (int i = 0; i < numerosInteiros.size(); i++) {
                Integer numeroAtual = numerosInteiros.get(i);

                if (i > 0) {
                    if (numeroAtual > maiorNumero) {
                        maiorNumero = numeroAtual;
                    }
                }
            }

            System.out.println(String.format("\nO maior número da lista é %d", maiorNumero));

            System.out.println(String.format("\nA soma de todos os números é %d", somaDeTodosOsNumeros));
        } else {
            System.out.println("A lista não possui nenhum número!");
        }
    }
}
