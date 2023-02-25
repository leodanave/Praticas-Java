/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.atividade02.ac01;

/**
 *
 * @author Leonardo
 */
public class ValidacaoNumerica {
 
    String verificarPrimo(Integer numeroDigitado){
        
    Integer validacaoNumero = 0;
        
        for (int i = 1; i <= numeroDigitado; i++) {
            if(numeroDigitado % i == 0) {
                validacaoNumero++;
            } 
        }
        
        if (validacaoNumero == 2) {
            return "É primo!";
        } else {
            return "Não é primo!";
        }
        
    }
    
}
