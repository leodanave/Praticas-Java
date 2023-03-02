/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.lista03;

/**
 *
 * @author Leonardo
 */
public class ClasseSocial {
    // Assinatura do método (retorno/nome/argumento)
    Double calcularQtdSalario(Double renda){
        return renda / 1045.0;
    }
    
    String definirClasseSocial(Double renda){
        
        if (renda > 0 && renda <= 2090.00){
            return "E";
        } else if (renda <= 4180.0){
            return "D";
        } else if (renda <= 10450.0){
            return "C";
        } else if (renda <= 20900.0){
            return "B";
        } else {
            return "A";
        }
    }
}
