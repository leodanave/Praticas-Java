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
public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        
        DescontoProgressivo descProg = new DescontoProgressivo();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bem vindo ao sistema de desconto progressivo!\n");
        
        System.out.println("Digite o valor unitário do produto:");
        Double valorInserido = leitor.nextDouble();
        
        System.out.println("Digite a quantidade:");
        Integer quantidadeInserida = leitor.nextInt();
        
        descProg.exibirNotaFiscal(valorInserido, quantidadeInserida,
                valorInserido, quantidadeInserida);
        
    }
}
