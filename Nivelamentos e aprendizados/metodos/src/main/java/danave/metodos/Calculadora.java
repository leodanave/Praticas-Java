/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.metodos;

/**
 *
 * @author Leonardo
 */
public class Calculadora {

    // Evitar colocar print do retorno dentro do próprio método
    // isso pode me fazer esquecer de usar o retorno onde o método é chamado
    Integer somar(Integer numero01, Integer numero02) {
        return numero01 + numero02;
    }

    void exibirSoma(Integer numero01, Integer numero02) {
        System.out.println(numero01 + numero02 + 10);
    }

    // subtrair(){}
    Integer subtrair(Integer numero01, Integer numero02) {
        return numero01 - numero02;
    }

    // multiplicar(){}
    Integer multiplicar(Integer numero01, Integer numero02) {
        return numero01 * numero02;
    }

    // dividir(){}
    Double dividir(Double numero01, Double numero02) {
        return numero01 / numero02;
    }

    Boolean isPar(Double numeroVerificar) {
        Boolean isPar;
        if (numeroVerificar % 2 == 0) {
            isPar = true;
        } else {
            isPar = false;
        }
        
        return isPar;
    }
}
