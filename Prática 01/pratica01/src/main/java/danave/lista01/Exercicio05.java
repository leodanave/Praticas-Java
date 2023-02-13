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
public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner calculadora = new Scanner(System.in);
        
        System.out.println("Insira um número:");
        Double numero01 = calculadora.nextDouble();
        
        System.out.println("Insira mais um número:");
        Double numero02 = calculadora.nextDouble();
        
        Double soma = numero01 + numero02;
        Double subtracao = numero01 - numero02;
        Double multiplicacao = numero01 * numero02;
        Double divisao = numero01 / numero02;
        
        System.out.println("Resultado da soma: " + soma
        + "\nResultado da subtração: " + subtracao
        + "\nResultado da multiplicação: " + multiplicacao
        + "\nResultado da divisão: " + divisao);
        
    }
}
