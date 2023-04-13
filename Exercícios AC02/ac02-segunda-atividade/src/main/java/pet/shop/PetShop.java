/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pet.shop;

/**
 *
 * @author leodanave
 */
public class PetShop {

    private String nome;
    private Double faturamentoTotal;

    public PetShop(String nome, Double faturamentoTotal) {
        this.nome = nome;
        this.faturamentoTotal = faturamentoTotal;
    }

    public void darBanho(Pet pet, Double valor) {

        if (valor > 0) {
            pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
            pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valor);

            System.out.println(String.format("Coisa boa! %s já está de banho tomado\n"
                    + "O valor do banho foi R$%.2f\n", pet.getNome(), valor));

            faturamentoTotal += valor;
        } else {
            System.out.println("Valor para o banho inválido!");
        }
    }

    public void darBanho(Pet pet, Double valor, Integer desconto) {
        if (valor > 0 && desconto > 0) {
            Double valorComDesconto = valor - (valor *(desconto / 100.0));

            pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
            pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valorComDesconto);

            System.out.println(String.format("Coisa boa! %s já está de banho tomado\n"
                    + "O valor do banho era R$%.2f, mas com desconto de %d%% ele ficou"
                    + " %.2f\n", pet.getNome(), valor, desconto, valorComDesconto));

            faturamentoTotal += valorComDesconto;
        } else {
            System.out.println("Valor do banho ou desconto inválido!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(Double faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
    }

    @Override
    public String toString() {
        return String.format("""
        Descrição do PetShop                     
                             
        Nome do PetShop: %s
        Faturamento total: %.2f\n                                                                 
                                         """, nome, faturamentoTotal);
    }

}
