/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.lista03;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class TesteClasseSocial {
    public static void main(String[] args) {
        
        // Instância = criação de objeto
        ClasseSocial classe = new ClasseSocial();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira a sua renda:");
        Double rendaInserida = leitor.nextDouble();
        
        Double resultadoSalarioMinimo = classe.calcularQtdSalario(rendaInserida);
        String resultadoClasseSocial = classe.definirClasseSocial(rendaInserida);
        
        System.out.println(String.format("Você recebe aproximadamente %.2f"
                + " salários mínimos.\n"
                + "Você pertence a classe social: %s.", resultadoSalarioMinimo,
                resultadoClasseSocial));
        
    }
}
