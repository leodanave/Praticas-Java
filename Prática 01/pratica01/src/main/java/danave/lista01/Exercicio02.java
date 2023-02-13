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
public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner filhos = new Scanner(System.in);
        
        System.out.println("Digite quantos filhos de 0 a 3 anos você tem:");
        Integer filhosAteTres = filhos.nextInt();
        
        System.out.println("Digite quantos filhos de 4 a 16 anos você tem");
        Integer filhosAteDezesseis = filhos.nextInt();
        
        System.out.println("Digite quantos filhos de 17 a 18 anos você tem");
        Integer filhosAteDezoito = filhos.nextInt();
        
        Double contaFilhosAteTres = filhosAteTres * 25.12;
        Double contaFilhosAteDezesseis = filhosAteDezesseis * 15.88;
        Double contaFilhosAteDezoito = filhosAteDezoito * 12.44;
        Double totalConta = contaFilhosAteTres + contaFilhosAteDezesseis 
                + contaFilhosAteDezoito;
        Integer totalFilhos = filhosAteTres + filhosAteDezesseis +
                filhosAteDezoito;
        
        System.out.println("Você tem um total de " + totalFilhos
        + " e vai receber R$" + totalConta + " de bolsa.");
    }
}
