/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danave.atividade02.ac01;

/**
 *
 * @author Leonardo
 */
public class DescontoProgressivo {
    
    Double calcularDesconto(Double valor, Integer quantidade){
        Double valorTotal = valor * quantidade;
        if (quantidade > 0 && quantidade <= 1) {
            return valorTotal * 0.9;
        } else if (quantidade == 2) {
            return valorTotal * 0.8;
        } else {
            return valorTotal * 0.7;
        }
    }
    
    void exibirSeparacao(){
        System.out.println("--------------------------");
    }
    
    void exibirNotaFiscal(Double valorProduto, Integer quantidadeProduto
    , Double valor, Integer quantidade){
        exibirSeparacao();
        System.out.println("Valor do produto: " + valorProduto);
        System.out.println("Quantidade: " + quantidadeProduto);
        exibirSeparacao();
        System.out.println(String.format("Valor com desconto: %.2f" ,calcularDesconto(valor, quantidade)));
        
    }
    
}
