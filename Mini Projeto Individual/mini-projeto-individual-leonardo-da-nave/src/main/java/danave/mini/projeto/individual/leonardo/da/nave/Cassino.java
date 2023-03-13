/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.mini.projeto.individual.leonardo.da.nave;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author leodanave
 */
public class Cassino {

    Scanner leitor = new Scanner(System.in);
    Integer fichasAtualizadas;
    Integer fichasUsuario;

    Integer calcularResultadoRoleta(Integer fichasApostadas, Integer corEscolhida,
            Integer fichasUsuario, Integer numeroRandomico) {

        if (numeroRandomico == 0 && corEscolhida.equals(1)) {
            return -1;
        } else if (numeroRandomico % 2 == 0 && corEscolhida.equals(2)) {
            return fichasApostadas * 2;
        } else if (numeroRandomico % 2 == 1 && corEscolhida.equals(3)) {
            return fichasApostadas * 2;
        } else {
            return 0;
        }
    }

    void exibirTextoDeAposta(Integer fichasApostadas,
            Integer corEscolhida) {
        System.out.println("""
        ------------------------------------------
        | Vamos começar!                         |      
        |                                        |     
        | Insira o valor que você quer apostar:  |                           
        ------------------------------------------ 
                           """);

        fichasApostadas = leitor.nextInt();

        if (fichasApostadas > fichasUsuario) {
            System.out.println("Valor inválido!");
        } else {
            System.out.println("""
        ------------------------------------------
        | Insira a cor em que você quer apostar  |
        |                                        |
        | 1 - Branco                             |
        | 2 - Vermelho                           |
        | 3 - Preto                              |                       
        ------------------------------------------                                                    
                               """);

            corEscolhida = leitor.nextInt();

            if (corEscolhida > 3 || corEscolhida < 1) {
                System.out.println("Valor inválido!");
            } else {
                System.out.println("Vamos rodar a roleta!");
                Integer numeroRandomicoRoleta = ThreadLocalRandom.current().nextInt(0, 16);
                Integer resultadoRoleta
                        = calcularResultadoRoleta(fichasApostadas, corEscolhida,
                                fichasUsuario, numeroRandomicoRoleta);

                if (resultadoRoleta == 0) {
                    fichasAtualizadas = subtrairFichasUsuario(fichasApostadas);
                    fichasUsuario = fichasAtualizadas;
                    System.out.println("O número sorteado foi " + numeroRandomicoRoleta + "\n");

                    System.out.println("Infelizmente você perdeu!");

                    System.out.println(String.format("""
            ------------------------------------------
            | Você tem o total de %d fichas          |
            ------------------------------------------                                                            
                                       
                                       """, fichasUsuario));
                } else if (resultadoRoleta == -1) {
                    System.out.println("O número sorteado foi " + numeroRandomicoRoleta + "\n");
                    fichasAtualizadas = multiplicarFichasUsuario(fichasApostadas);
                    fichasUsuario = fichasAtualizadas;
                    Integer resultadoBranco = multiplicarFichasUsuario(fichasApostadas);
                    System.out.println(String.format("Você ganhou %d fichas, parabéns!",
                            resultadoBranco));

                    System.out.println(String.format("""
            ------------------------------------------
            | Você tem o total de %d fichas          |
            ------------------------------------------                                                            
                                       
                                       """, fichasUsuario));
                } else {
                    System.out.println("O número sorteado foi " + numeroRandomicoRoleta + "\n");
                    System.out.println(String.format("Você ganhou %d fichas, parabéns!",
                            resultadoRoleta));

                    fichasAtualizadas = somarFichasUsuario(fichasApostadas);
                    fichasUsuario = fichasAtualizadas;

                    System.out.println(String.format("""
            ------------------------------------------
            | Você tem o total de %d fichas          |
            ------------------------------------------                                                            
                                       
                                       """, fichasUsuario));
                }
            }
        }
    }

    void exibirTextoDeDados(Integer fichasApostadasDados, Integer numeroDeduzido) {
        System.out.println("""
        ------------------------------------------
        | Vamos começar!                         |      
        |                                        |     
        | Insira o valor que você quer apostar:  |                           
        ------------------------------------------ 
                           """);

        fichasApostadasDados = leitor.nextInt();

        if (fichasApostadasDados > fichasUsuario) {
            System.out.println("Valor inválido");
        } else {

            System.out.println("""
        ------------------------------------------
        | Insira o número que você deduz que     |
        | vai cair:                              |
        ------------------------------------------                                                    
                               """);

            numeroDeduzido = leitor.nextInt();

            if (numeroDeduzido > 6 || numeroDeduzido < 1) {
                System.out.println("Valor inválido!");
            } else {
                System.out.println("Vamos girar o dado!");
                Integer numeroRandomicoDado = ThreadLocalRandom.current().nextInt(1, 7);
                Integer resultadoDado
                        = calcularResultadoDados(numeroDeduzido,
                                fichasUsuario, numeroRandomicoDado);

                if (resultadoDado == 0) {
                    fichasUsuario = subtrairFichasUsuario(fichasApostadasDados);
                    System.out.println("O número sorteado foi " + numeroRandomicoDado + "\n");

                    System.out.println("Infelizmente você perdeu!");

                    System.out.println(String.format("""
            ------------------------------------------
            | Você tem o total de %d fichas          |
            ------------------------------------------                                                            
                                       
                                       """, fichasUsuario));
                } else {
                    System.out.println("O número sorteado foi " + numeroRandomicoDado + "\n");
                    System.out.println(String.format("Você ganhou %d fichas, parabéns!",
                            resultadoDado));

                    fichasUsuario = somarFichasUsuario(fichasApostadasDados);

                    System.out.println(String.format("""
            ------------------------------------------
            | Você tem o total de %d fichas          |
            ------------------------------------------                                                            
                                       
                                       """, fichasUsuario));
                }
            }
        }
    }

    Integer calcularResultadoDados(Integer fichasApostadasDados, Integer numeroDeduzido,
            Integer numeroRandomicoDado) {

        if (numeroRandomicoDado == numeroDeduzido) {
            return fichasApostadasDados * 2;
        } else {
            return 0;
        }
    }

    Integer somarFichasUsuario(Integer fichasApostadas) {
        return fichasUsuario += fichasApostadas;
    }

    Integer subtrairFichasUsuario(Integer fichasApostadas) {
        return fichasUsuario -= fichasApostadas;
    }

    Integer multiplicarFichasUsuario(Integer fichasApostadas) {
        return fichasUsuario += fichasApostadas * 13;
    }
}
