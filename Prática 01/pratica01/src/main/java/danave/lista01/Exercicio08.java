/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.lista01;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner media = new Scanner(System.in);
        
        System.out.println("Insira seu nome:");
        String nome = media.nextLine();
        
        System.out.println("Insira uma nota:");
        Double nota1 = media.nextDouble();
        
        System.out.println("Insira outra nota:");
        Double nota2 = media.nextDouble();
        
        Double mediaFinal = (nota1 + nota2) / 2;
        
        System.out.println("Olá, " + nome + ". Sua média foi de "
        + mediaFinal);
        
    }
}
