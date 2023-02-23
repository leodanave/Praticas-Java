/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.metodos;

/**
 *
 * @author Leonardo
 */
public class TesteMetodos {
    public static void main(String[] args) {
        
        // Para utilizar os métodos das nossas classes, precisamos criar
        // objetos, ou seja, fazer uma instância
        
        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();
        
        String nome01 = "Xampson";
        String nome02 = "Giuliana";
        
        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado("Xampson");
        
        System.out.println("Soma: ");
        
        Integer numDigitado = 10; // Imagine que veio do Scanner
        
        Integer resultadoSoma = calc.somar(numDigitado, 32) + 10;
        System.out.println("Retorno com variável: " + resultadoSoma);
        System.out.println("Direto no print: " + calc.somar(numDigitado, 32));
        
        Integer resultadoSubtracao = calc.subtrair(numDigitado, 2);
        System.out.println("Retorno com variável: " + resultadoSubtracao);
        System.out.println("Direto no print: " + calc.subtrair(numDigitado, 8));
        
        Integer resultadoMultiplicacao = calc.multiplicar(numDigitado, 25);
        System.out.println("Retorno com variável: " + resultadoMultiplicacao);
        System.out.println("Direto no print: " + calc.multiplicar(numDigitado, 25));
        
        Double resultadoDivisao = calc.dividir(58.00, 3.00);
        System.out.println("Retorno com variável: " + resultadoDivisao);
        System.out.println("Direto no print: " + calc.dividir(15.00, 3.00));
        
    }
}
