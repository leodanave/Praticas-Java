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
public class TesteValidacaoNumerica {
    public static void main(String[] args) {
       
        ValidacaoNumerica val = new ValidacaoNumerica();
        
        Scanner leitor = new Scanner(System.in);
        
        Integer numeroDigitado = 0;
        
        System.out.println("Validação numérica: Veja se um número é primo.");
        while (numeroDigitado >= 0) {            
            System.out.println("Digite um número:");
            numeroDigitado = leitor.nextInt();
            if(numeroDigitado >= 0) {
            System.out.println(val.verificarPrimo(numeroDigitado));
            } else {
                System.out.println("O programa foi encerrado!");
                break;
            }
        }
        
    }
}
