/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.lista02;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Potencia {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de uma base");
        Double base = leitor.nextDouble();
        
        System.out.println("Insira o valor do expoente");
        Double expoente = leitor.nextDouble();
        
        Double resultado = base;
        
        if(expoente == 0){
            System.out.println("O resultado da sua potência é 1");
        } else {
        
            for (int i = 1; i < expoente; i++) {
            resultado *= base ; 
        }
        
        System.out.println(String.format("O resultado da sua potência é %.2f",
                resultado));
        
        }
        
    }
    
}
