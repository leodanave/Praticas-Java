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
public class Login {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String login = "admin";
        String senha = "#SPtech2022";
        
        System.out.println("Insira o login: ");
        String loginDigitado = leitor.nextLine();
        System.out.println("Insira a senha: ");
        String senhaDigitada = leitor.nextLine();
        
        while(!loginDigitado.equals(login) || !senhaDigitada.equals(senha)){
            System.out.println("Login e/ou senha inválidos");
            System.out.println("Insira o login: ");
            loginDigitado = leitor.nextLine();
            System.out.println("Insira a senha: ");
            senhaDigitada = leitor.nextLine();
        }
        
        System.out.println("Login realizado com sucesso!");
    }
    
}
