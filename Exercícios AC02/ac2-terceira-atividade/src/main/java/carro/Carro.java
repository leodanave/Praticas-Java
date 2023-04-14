/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

/**
 *
 * @author leodanave
 */
public class Carro {

    private String modelo;
    private Double valor;
    private Integer ano;
    private String marca;

    public Carro(String modelo, Double valor, Integer ano, String marca) {
        this.modelo = modelo;
        this.valor = valor;
        this.ano = ano;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString() {
        return String.format("""
        Modelo: %s
        Valor: %.2f
        Ano: %d                                                                    
        Marca: %s\n""",
                modelo,
                valor,
                ano,
                marca);
    }

}
