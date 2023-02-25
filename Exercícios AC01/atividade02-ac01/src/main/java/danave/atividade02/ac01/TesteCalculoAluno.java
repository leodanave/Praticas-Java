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
public class TesteCalculoAluno {

    public static void main(String[] args) {
        
        CalculoAluno calc = new CalculoAluno();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira uma nota:");
        Double notaDigitada01 = leitor.nextDouble();
        
        System.out.println("Insira outra nota:");
        Double notaDigitada02 = leitor.nextDouble();
        
        Double mediaCalculada = calc.calcularMedia(notaDigitada01, notaDigitada02);
        
        System.out.println(String.format("A média das suas duas notas é: %.2f.",
                mediaCalculada));
        
    }
}
