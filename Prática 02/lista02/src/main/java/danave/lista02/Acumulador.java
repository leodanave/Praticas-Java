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
public class Acumulador {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer numeroDigitado;
        
        int i = 0;
        
        do{
            System.out.println("Digite um número: ");
            numeroDigitado = leitor.nextInt();
            i += numeroDigitado;
        } while(!numeroDigitado.equals(0));
        
        System.out.println(String.format("A soma dos números é: %d", i));
        
    }
    
}
