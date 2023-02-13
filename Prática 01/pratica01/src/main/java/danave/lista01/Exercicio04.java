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
public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner troco = new Scanner(System.in);
        
        System.out.println("Insira o valor unitário do produto:");
        Double valorUnitario = troco.nextDouble();
                
        System.out.println("Insira a quantidade vendida:");        
        Double quantidadeVendida = troco.nextDouble();
        
        System.out.println("Insira o valor pago pelo cliente:");
        Double valorCliente = troco.nextDouble();
        
        Double valorTotal = valorUnitario * quantidadeVendida;
        Double trocoCliente = valorCliente - valorTotal;
        
        System.out.println("Seu troco será de R$" + trocoCliente
        + ", onde R$" + trocoCliente + " é o valor a ser devolvido"
                + " ao cliente");
        
    }
}
