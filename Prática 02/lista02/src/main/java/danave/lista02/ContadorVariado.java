/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.lista02;

/**
 *
 * @author Leonardo
 */
public class ContadorVariado {
    
    public static void main(String[] args) {
        
        Double numeroDecimal = 0.15;
        
        for (int i = 1; numeroDecimal < 5.00; i++) {
            
            System.out.println(String.format("Número %d - %.2f", i,numeroDecimal));
            numeroDecimal += 0.15;
        }
        
    }
    
}
