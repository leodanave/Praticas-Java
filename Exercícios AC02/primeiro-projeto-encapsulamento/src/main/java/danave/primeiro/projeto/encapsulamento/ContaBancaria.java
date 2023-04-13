/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.primeiro.projeto.encapsulamento;

/**
 *
 * @author leodanave
 */
public class ContaBancaria {
    Double saldo = 0.0;
    String nomeTitular;
    
    public void depositar(Double valorDeposito) {
        if(valorDeposito > 0.0) {
            this.saldo += valorDeposito;
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
    
    public void sacar(Double valorSaque) {
        if (valorSaque <= this.saldo && valorSaque > 0) {
            this.saldo -= valorSaque;
        } else {
            System.out.println("Valor inválido!");
        }
    }
    
    public void transferir(Double valorTransferencia, ContaBancaria destino) {
        if(this.saldo >= valorTransferencia) {
			this.saldo -= valorTransferencia;
			destino.depositar(valorTransferencia);
		} else {
            System.out.println("Sua transferência não foi realizada");
        }
    }
    
    
}
