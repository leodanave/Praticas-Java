/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fruta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author leodanave
 */
public class TesteFruta {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<String> frutas = new ArrayList();

        frutas.add("Melancia");
        frutas.add("Manga");
        frutas.add("Morango");
        frutas.add("Uva");
        frutas.add("Amora");
        frutas.add("Abacaxi");
        frutas.add("Pera");
        frutas.add("Maçã");
        frutas.add("Melão");

        System.out.println("""
                        Lista de frutas
            -----------------------------------------
            Digite uma fruta para ver se tem na lista
                           """);

        String frutaDigitada = leitor.nextLine();

        Boolean temFruta = false;
                    
        for (int i = 0; i < frutas.size(); i++) {
            String frutaAtual = frutas.get(i);

            if (frutaAtual.equalsIgnoreCase(frutaDigitada)) {
                System.out.println(String.format("A fruta %s existe na lista!",
                        frutaAtual));
                temFruta = true;
            }
        }
        
        if (!temFruta) {
            System.out.println(String.format("Não existe a fruta %s na lista!",
                    frutaDigitada));
        }

    }
}
