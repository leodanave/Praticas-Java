/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.primeiro.projeto.poo;

/**
 *
 * @author leodanave
 */
public class BilheteUnico {
    // Atributos == Características
    String nomeTitular;
    Double saldo;
    Boolean possuiMeiaEntrada;
    
    // Recarregar e exibe o valor recarregado e saldo
    void recarregar(Double valorRecarga){
        
        if(valorRecarga > 0) {
        saldo += valorRecarga;
            System.out.println(String.format("%s, você recarregou %.2f e seu"
                    + " saldo agora é %.2f", nomeTitular,valorRecarga,saldo));
        } else {
            System.out.println("Valor negativo!");
        }
    }
    
    // Passagem é sempre 4,40
    void usar() {
        
        if(possuiMeiaEntrada && saldo >= 2.20) {
            saldo -= 2.20;
        } else if(saldo >= 4.40) {
            saldo -= 4.40;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
    
    
}
