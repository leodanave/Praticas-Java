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
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner cadastro = new Scanner(System.in);
        
        System.out.println("Digite seu login:");
        String login = cadastro.nextLine();
        
        System.out.println("Digite sua senha:");
        String senha = cadastro.nextLine();
        
        System.out.println("Digite a quantidade de erros possíveis"
                + " antes do bloqueio");
        Integer erros = cadastro.nextInt();
        
        System.out.println("Seu login é: " + login + " e sua senha é: "
        + senha + ". Você tem " + erros + " tentativas antes de ser bloqueado");
        
    }
}
