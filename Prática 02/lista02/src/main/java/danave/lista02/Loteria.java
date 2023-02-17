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
public class Loteria {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro de 1 a 10");
        Integer numeroDigitado = leitor.nextInt();
        
        Integer numeroAleatorio;
        
        int i = 0;
        do{
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);   
            System.out.println(numeroAleatorio);
            i++;
        }
        while (!numeroAleatorio.equals(numeroDigitado));
        
        if(i > 0 && i <= 3){
            System.out.println("Você é MUITO sortudo!");
        } else if(i <= 10){
            System.out.println("Você é sortudo!");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar...");
        }
        
    }
    
}
