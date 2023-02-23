package danave.primeiro.projeto.nivelamento;

/**
 *
 * @author Leonardo
 */
public class OperadorMatematico {
    public static void main(String[] args) {
        
    // Igual ao JS
    // + Soma
    // - Subtração
    // * Multiplicação
    // / Divisão
    // % Resto
    // ++ Soma 1
    // -- Subtrai 1
    // +=
    // *=
    // -=
    
    // Diferente do JS -> ** para potência não temos :(
    
    Integer numero01 = 10;
    Integer numero02 = 10;
    
    numero01 += 20;
    
    // 01) Soma
    Integer soma = numero01 + numero02;
        // () Usado para separar concatenação de conta, por exemplo:    
        System.out.println("Soma com variável: " + soma);
        System.out.println("Somando direito: " + (numero01 + numero02));
        
    // 02) Subtração
        System.out.println("Subtração: " + (numero01 - numero02));
    
    // 03) Multiplicação
        System.out.println("Multiplicação: " + (numero01 * numero02));
        
    // 04) Divisão
        System.out.println("Divisão: " + (numero01 / numero02));
    
    // 05) Resto (%)
        System.out.println("Resto: " + (numero01 % numero02));
        
    // 06) Potência
    Double potencia = Math.pow(2, 5);
        System.out.println("Potência: " + potencia);
        //System.out.println("Potência: " + Math.pow(2, 5));
        
        // Além de métodos, essa classe tem variáveis que ajudam
        System.out.println("Valor de PI: " + Math.PI);
        
    } 
}
