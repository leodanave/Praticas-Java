/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.lista02;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Votacao {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer votoMussarela = 0;
        Integer votoCalabresa = 0;
        Integer votoQuatroQueijos = 0; 
        String frase = "Obrigado pelo seu voto!\n";
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Vote no seu sabor favorito, onde: \n"
                    + "5 - Mussarela \n 25 - Calabresa \n 50 - Quatro queijos");
            Integer numeroDigitado = leitor.nextInt();
            
            switch(numeroDigitado){
                case 5:
                    votoMussarela++;
                    System.out.println(frase);
                    break;
                case 25:
                    votoCalabresa++;
                    System.out.println(frase);
                    break;
                case 50:
                    votoQuatroQueijos++;
                    System.out.println(frase);
                    break;
            }
            
        }
        
        System.out.println(String.format("O resultado da pesquisa é:\n"
                + "Mussarela: %d votos\n"
                + "Calabresa: %d votos\n"
                + "Quatro Queijos: %d votos", votoMussarela,votoCalabresa,
                votoQuatroQueijos));
        
        String saborFavorito = "O sabor favorito segundo a votação foi: ";
        
        if (votoMussarela > votoCalabresa && votoMussarela > votoQuatroQueijos) {
            System.out.println(saborFavorito + "mussarela");
        } else if(votoCalabresa > votoMussarela && votoCalabresa > votoQuatroQueijos) {
            System.out.println(saborFavorito + "calabresa");
        } else if(votoQuatroQueijos > votoMussarela && votoQuatroQueijos > votoCalabresa) {
            System.out.println(saborFavorito + "quatro queijos");
        } else if(votoMussarela.equals(votoCalabresa) ||
                votoCalabresa.equals(votoQuatroQueijos) ||
                votoQuatroQueijos.equals(votoMussarela)) {
            System.out.println("Houve um empate na votação");
        }
        
    }
    
}
