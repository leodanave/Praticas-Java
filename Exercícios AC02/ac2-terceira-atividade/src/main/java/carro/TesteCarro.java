/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author leodanave
 */
public class TesteCarro {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        List<Carro> carros = new ArrayList(); 
        
        carros.add(new Carro("Civic", 120000.0, 2019, "Honda"));
        carros.add(new Carro("Peugeot 308", 80000.0, 2022, "Peugeot"));
        carros.add(new Carro("Porsche 911", 1730000.00, 2022, "Porsche"));
        carros.add(new Carro("Ferrari 488", 4400000.00, 2020, "Ferrari"));
        carros.add(new Carro("Uno", 20000.00, 2010, "Fiat"));
        
        System.out.println("Carros com ano acima de 2018\n");
        for (int i = 0; i < carros.size(); i++) {
            Carro carroAtual = carros.get(i);
            
            if (carroAtual.getAno() > 2018) {
                System.out.println(carroAtual);
            }
        }
        
        System.out.println("\nCarros com valor abaixo de 60.000\n");
        for (int i = 0; i < carros.size(); i++) {
            Carro carroAtual = carros.get(i);
            
            if (carroAtual.getValor() < 60000.0) {
                System.out.println(carroAtual);
            }
        }
        
        System.out.println("\nInsira uma marca de sua preferência para consultar"
                + " modelos dessa marca.");
        String modeloDigitado = leitor.nextLine();
        for (int i = 0; i < carros.size(); i++) {
            Carro carroAtual = carros.get(i);
            
            if(carroAtual.getMarca().equalsIgnoreCase(modeloDigitado)) {
                System.out.println(carroAtual);
            }
        }
      
        
    }
}
