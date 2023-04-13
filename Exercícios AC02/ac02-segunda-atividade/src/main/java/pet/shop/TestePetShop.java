/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pet.shop;

/**
 *
 * @author leodanave
 */
public class TestePetShop {
    public static void main(String[] args) {
        
        Pet pet01 = new Pet("Bob", "Pastor alemão", 0.0);
        Pet pet02 = new Pet("Thor", "Bulldog", 500.0);
        Pet pet03 = new Pet("Lili", "Pinscher", 1240.0);
        
        PetShop petShop01 = new PetShop("Amigo Pet", 15350.0);
        
        petShop01.darBanho(pet01, 55.0);
        petShop01.darBanho(pet02, 80.0, 15);
        petShop01.darBanho(pet03, 100.0, 40);
        
        System.out.println(petShop01);
        System.out.println(pet01);
        System.out.println(pet02);
        System.out.println(pet03);
    }
}
