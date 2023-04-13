/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.primeiro.projeto.encapsulamento;

/**
 *
 * @author leodanave
 */
public class TesteContaBancaria {
    public static void main(String[] args) {
        
        ContaBancaria conta01 = new ContaBancaria();
        conta01.nomeTitular = "William";
        
        ContaBancaria conta02 = new ContaBancaria();
        conta02.nomeTitular = "Xampson";
       
        conta01.depositar(100.0);
        conta02.sacar(10.0);
        conta02.depositar(20.0);
        conta02.sacar(2.0);
        
        System.out.println("C1: R$" + conta01.saldo);
        System.out.println("C2: R$" + conta02.saldo);
    }
}
