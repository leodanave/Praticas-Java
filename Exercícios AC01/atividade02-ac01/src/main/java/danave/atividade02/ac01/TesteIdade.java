/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class TesteIdade {
    public static void main(String[] args) {
        
        Idade idade = new Idade();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira sua idade:");
        Integer idadeInserida = leitor.nextInt();
        
        idade.classificarIdade(idadeInserida);
        
    }
}
