/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.segundo.projeto.nivelamento;

/**
 *
 * @author Leonardo
 */
public class OperadorTernario {

    public static void main(String[] args) {
        
        Boolean bloqueado = true;
        
        String frase;
        
        if(bloqueado) {
            frase = "Usuário bloqueado";
        } else {
            frase = "Usuário desbloqueado";
        }
        
        System.out.println("frase");
        
        frase = bloqueado ? "Usuário bloqueado" : "Usuário desbloqueado";
        
        //Também dá pra usar com outros tipos
        
        // Cenário: Se o salário for maior que 1000.0
        // O bônus é de 0.15, se for menor que 1000.0
        // O bônus é de 0.10
        
        Double bonus = 0.0;
        Double salario = 1075.50;
        
        if(salario >= 1000.0) {
            bonus = 0.15;
        } else {
            bonus = 0.10;
        }
        
        bonus = salario >= 1000.0 ? 0.15 : 0.10;
        
        System.out.println("Bônus é: " + bonus);
        
    }
    
}
