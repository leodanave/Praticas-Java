/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.primeiro.projeto.poo;

import java.util.Scanner;

/**
 *
 * @author leodanave
 */
public class TesteBilheteUnico {
    public static void main(String[] args) {
        
        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nomeTitular = "Xampson";
        bilhete01.possuiMeiaEntrada = true;
        bilhete01.saldo = 0.0;
        
        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "William";
        bilhete02.possuiMeiaEntrada = false;
        bilhete02.saldo = 0.0;
        
        Scanner leitor = new Scanner(System.in);
        
        bilhete01.usar();
        bilhete01.recarregar(100.00);
        bilhete01.usar();
        System.out.println("------------------------------------");
        bilhete01.recarregar(3.50);
        bilhete01.usar();
        bilhete01.recarregar(10.00);
        bilhete01.usar();
        
    }
}
