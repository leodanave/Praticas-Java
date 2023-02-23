/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.segundo.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class SwitchCase {
    
    public static void main(String[] args) {
        
        // O usuário digita um nº
        // E eu mostro o dia da semana equivalente
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número");
        Integer diaSemana = leitor.nextInt();
        
        switch(diaSemana){
            case 1:
                System.out.println("Segundou!");
                // Aqui pode ter um código complexo
                break;
            case 2:
                System.out.println("Terçou!");
                break;
            case 3:
                System.out.println("Quartou!");
                break;
            case 4:
                System.out.println("Quintou!");
                break;
            case 5:
                System.out.println("Sextou!!!");
                break;
            default:
                System.out.println("Dia inválido!");
        }
        
    }
    
}
