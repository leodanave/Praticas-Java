/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Leonardo
 */
public class NumeroRandomico {

    public static void main(String[] args) {
        
        // Também tem uma classe Math.random
        // mas precisa criar um objeto
        // um jeito mais simples:
        
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
        
        System.out.println("Número " + numeroAleatorio);
        
        Double doubleAleatorio = ThreadLocalRandom.current()
                .nextDouble(1.7, 35.8);
        
        System.out.println("Aleatório real: " + doubleAleatorio);
    }
    
}
