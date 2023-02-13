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
public class Exercicio06 {
    public static void main(String[] args) {

        Scanner salario = new Scanner(System.in);
        
        System.out.println("Insira o salário bruto:");
        Double salarioBruto = salario.nextDouble();
        
        Double inss = salarioBruto * 0.1;
        Double ir = salarioBruto * 0.2;
        
        System.out.println("Quanto custa sua condução diária só de ida?");
        Double conducao = salario.nextDouble();
        
        Double descontoTransporte = conducao * 2 * 22;
        
        Double descontos = inss + ir + descontoTransporte;
        Double salarioLiquido = salarioBruto - descontos;
        
        System.out.println("Seu salário bruto é R$" + salarioBruto
        + ", tem um total de R$" + descontos + " em descontos e receberá"
                + " um líquido de R$" + salarioLiquido);
        
    }
}
