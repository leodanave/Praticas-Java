/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.atividade02.ac01;

/**
 *
 * @author Leonardo
 */
public class Idade {
    
    void classificarIdade(Integer idade){
        String frase = "De acordo com sua idade, você é: ";
        
        if (idade >= 0 && idade <= 2) {
            System.out.println(frase + "Bebê");
        } else if (idade <= 11){
            System.out.println(frase + "Criança");
        } else if (idade <= 19){
            System.out.println(frase + "Adolescente");
        } else if (idade <= 30){
            System.out.println(frase + "Jovem");
        } else if (idade <= 60){
            System.out.println(frase + "Adulto");
        } else {
            System.out.println(frase +"Idoso");
        }
    }
    
}
