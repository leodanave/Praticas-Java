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
public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner idade = new Scanner(System.in);
        
        System.out.println("Insira seu nome:");
        String nome = idade.nextLine();
        
        System.out.println("Olá, " + nome + "! Qual o ano de seu nascimento?");
        Integer dataNasc = idade.nextInt();
        
        Integer anos = 2030 - dataNasc;
        
        System.out.println("Em 2030 você terá " + anos + " anos.");
        
    }
}
