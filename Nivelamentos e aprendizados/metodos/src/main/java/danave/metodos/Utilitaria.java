/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.metodos;

/**
 *
 * @author Leonardo
 */
public class Utilitaria {
    // Retorno: esse não tem, é void!
    // Nome: exibirLinha (camelCase, igual variável)
    // Argumentos: esse não tem, fica dentro dos parênteses
    // Corpo: fica dentro das chaves {}
    
    void exibirLinha(){
        System.out.println("*--------*--------*");    
    }
    
    // Método com argumento
    
    void exibirNome(String nomeExibir){
        System.out.println("Meu nome é: " + nomeExibir);
    }
    
    // Métodos diferentes podem ter argumentos com o mesmo nome
    // já que eles nascem e morrem dentro do método
    
    void exibirNomeFormatado(String nomeExibir) {
       exibirLinha();
       exibirNome(nomeExibir);
       exibirLinha();
    }
}
