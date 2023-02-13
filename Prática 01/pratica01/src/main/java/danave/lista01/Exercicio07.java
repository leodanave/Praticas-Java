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
public class Exercicio07 {
    public static void main(String[] args) {

        Scanner elevador = new Scanner(System.in);
        
        System.out.println("Insira o limite de peso do elevador:");
        Double limitePeso = elevador.nextDouble();
        
        System.out.println("Insira o limite de pessoas do elevador:");
        Integer limitePessoa = elevador.nextInt();
        
        System.out.println("Insira o peso da primeira pessoa que entrou:");
        Double pesoPrimeira = elevador.nextDouble();
        
        System.out.println("Insira o peso da segunda pessoa que entrou");
        Double pesoSegunda = elevador.nextDouble();
        
        System.out.println("Insira o peso da terceira pessoa que entrou");
        Double pesoTerceira = elevador.nextDouble();
        
        Double pesoTotal = pesoPrimeira + pesoSegunda + pesoTerceira;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "
        + limitePessoa + " pessoas. O peso total no elevador é de "
        + pesoTotal + "kg, sendo que ele suporta " + limitePeso + "kg.");
    }
}
