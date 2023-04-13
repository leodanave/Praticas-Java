/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

/**
 *
 * @author leodanave
 */
public class Atividade {

    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }

    public void terminarAtividade(Integer diasUsados) {
        this.diasUsados = diasUsados;
        System.out.println(String.format("Seu prazo de %d dias foi definido, %s! \n", diasUsados, responsavel));
    }

    public void exibirRelatorio() {
        Integer diferencaDeDiasAtraso = diasUsados - diasEstimados;
        Integer diferencaDeDiasAntes = diasEstimados - diasUsados;

        if (diasUsados > diasEstimados) {

            System.out.println(String.format("Você estimou %d dia(s), mas a tarefa foi "
                    + "feita em %d dias (%d dia(s) a mais que o estimado). Melhore a estimativa. (%s)\n", diasEstimados, diasUsados,
                    diferencaDeDiasAtraso, responsavel));
        } else if (diasUsados < diasEstimados) {
            System.out.println(String.format("Você estimou %d "
                    + "dia(s), e a tarefa foi feita em %d dias (%d dia(s) a menos que o estimado). "
                    + "Parabéns! (%s)\n", diasEstimados, diasUsados,
                    diferencaDeDiasAntes, responsavel));
        } else {
            System.out.println(String.format("Você "
                    + "estimou %d dia(s), e a tarefa foi feita em %d dia(s), atendendo a estimativa "
                    + "com precisão. (%s)\n", diasEstimados, diasUsados, responsavel));
        }
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    @Override
    public String toString() {
        return String.format("""
        Atividade: %s
        Responsável: %s
        Dias estimados: %d                                                                    
        Dias usados: %d                                                                    
                                         """, nomeAtividade, responsavel, diasEstimados,
                                         diasUsados);
    }

}
