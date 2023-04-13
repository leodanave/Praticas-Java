/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

/**
 *
 * @author leodanave
 */
public class TesteAtividade {

    public static void main(String[] args) {

        Atividade atividade01 = new Atividade("Prototipação da página de dashboard", "Leonardo", 2);
        Atividade atividade02 = new Atividade("Realização do DER", "Vinicius", 4);
        Atividade atividade03 = new Atividade("Lista de linguagem de programação", "Luiz", 1);

        atividade01.terminarAtividade(4);
        atividade02.terminarAtividade(3);
        atividade03.terminarAtividade(1);

        System.out.println("Após a realização da tarefa...\n");

        atividade01.exibirRelatorio();
        atividade02.exibirRelatorio();
        atividade03.exibirRelatorio();

        System.out.println("Descrição das atividades\n");

        System.out.println(atividade01);
        System.out.println(atividade02);
        System.out.println(atividade03);

    }
}
