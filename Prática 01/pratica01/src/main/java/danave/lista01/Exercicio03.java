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
public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner calorias = new Scanner(System.in);
        
        System.out.println("Digite quantos minutos você passou aquecendo:");
        Integer minutosAquecimento = calorias.nextInt();
        
        System.out.println("Digite quantos minutos você passou fazendo"
                + " exercícios aeróbicos:");
        Integer minutosAerobico = calorias.nextInt();
        
        System.out.println("Digite quantos minutos você passou fazendo"
                + " musculação:");
        Integer minutosMusculacao = calorias.nextInt();
        
        Integer caloriasAquecimento = minutosAquecimento * 12;
        Integer caloriasAerobico = minutosAerobico * 20;
        Integer caloriasMusculacao = minutosMusculacao * 25;
        
        Integer caloriasTotal = caloriasAquecimento + caloriasAerobico
                + caloriasMusculacao;
        Integer minutosTotal = minutosAquecimento + minutosAerobico
                + minutosMusculacao;
        
        System.out.println("Olá, Chicó. Você fez um total de "
        + minutosTotal + " minutos de exercícios e perdeu cerca de "
        + caloriasTotal + " calorias.");
        
    }
}
