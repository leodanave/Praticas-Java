/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.mini.projeto.individual.leonardo.da.nave;

import java.util.Scanner;

/**
 *
 * @author leodanave
 */
public class TesteCassino {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Cassino cassino = new Cassino();
        Integer opcaoEscolhida;

        do {
            System.out.println("""                         
                    -------------------------------
                    |      Seja bem vindo ao      |
                    |           Cassino!          |
                    -------------------------------           
                    | Escolha uma das opções:     |
                    |                             |
                    | 1 - Conversão de fichas     |         
                    | 2 - Roleta                  |
                    | 3 - Jogo de dados           |
                    | 4 - Encerrar sistema        |  
                    -------------------------------   
                                  """);

            opcaoEscolhida = leitor.nextInt();

            if (opcaoEscolhida == 4) {
                break;
            } else if (opcaoEscolhida > 4 || opcaoEscolhida < 0) {
                System.out.println("Opção inválida, tente novamente!\n");
            } else {

                switch (opcaoEscolhida) {
                    case 1:
                        System.out.println("""
                    ------------------------------------------    
                    | Uma ficha é equivalente a 50 centavos. |
                    | Dito isso, insira o valor que você     |
                    | deseja converter em fichas (lembre-se  |
                    | de colocar valores inteiros)           |        
                    ------------------------------------------                        
                                       """);
                        Integer dinheiroInserido = leitor.nextInt();
                        cassino.fichasUsuario = dinheiroInserido * 2;
                        System.out.println(String.format("""
                    ------------------------------------------    
                    | O seu valor de fichas atual é: %d     |
                    ------------------------------------------                                 
                    |            Vamos apostar!!!            |           
                    ------------------------------------------      
                                       """, cassino.fichasUsuario));
                        break;
                    case 2:
                        System.out.println("""
                    ------------------------------------------    
                    |          Bem vindo à roleta!           | 
                    ------------------------------------------
                    | A roleta têm 15 números, onde os       |
                    | número ímpares são pretos, os pares    |    
                    | são vermelhos, e o número 0 é branco   |     
                    ------------------------------------------     
                    | Se a roleta cair em um número vermelho |                   
                    | ou preto, o dinheiro apostado é        |
                    | multiplicado por dois. 
                    | Se a roleta cair no número 0, o        | 
                    | dinheiro apostado é multiplicado por 14|
                    ------------------------------------------                   
                                       """);

                        Integer fichasApostadas = 0;
                        Integer corEscolhida = 0;

                        cassino.exibirTextoDeAposta(fichasApostadas, corEscolhida);

                        Integer escolhaRoleta;

                        do {

                            System.out.println("""
            ------------------------------------------    
            | Deseja continuar?                      |
            |                                        |
            | 1 - Sim                                |
            | 0 - Não                                |
            ------------------------------------------
                                           """);
                            escolhaRoleta = leitor.nextInt();

                            if (escolhaRoleta == 0) {
                                break;
                            } else {
                                cassino.exibirTextoDeAposta(fichasApostadas, corEscolhida);
                            }
                        } while (escolhaRoleta != 0);
                        break;
                    case 3:
                        Integer fichasApostadasDados = 0;
                        Integer numeroDeduzido = 0;

                        Integer escolhaDado;

                        System.out.println("""
                ------------------------------------------    
                |          Bem vindo aos dados!          | 
                ------------------------------------------
                | O jogo de dados se consiste em você    |
                | acertar o número que o dado vai cair,  |
                | se você acertar, suas fichas           |
                | se multiplicam por 2.                  |
                ------------------------------------------       
                                       """);

                        cassino.exibirTextoDeDados(fichasApostadasDados, numeroDeduzido);

                        do {

                            System.out.println("""
            ------------------------------------------    
            | Deseja continuar?                      |
            |                                        |
            | 1 - Sim                                |
            | 0 - Não                                |
            ------------------------------------------
                                           """);
                            escolhaDado = leitor.nextInt();

                            if (escolhaDado == 0) {
                                break;
                            } else {
                                cassino.exibirTextoDeDados(fichasApostadasDados,
                                        numeroDeduzido);
                            }
                        } while (escolhaDado != 0);
                        break;
                }

            }

        } while (opcaoEscolhida != 4);

    }
}
