package danave.primeiro.projeto.nivelamento;

/**
 *
 * @author Leonardo
 */
public class Tipo {
    public static void main(String[] args) {
         // Os tipos que mais usaremos em Java
         
         //01) para números inteiros -> Integer
         
         // Declarando e inicializando
         Integer idade = 20;
         
         // Só declarar
         Integer idade2;

         // Inicializar depois de declarada
         idade2 = 21;

         //02) Números quebrados -> Double
         Double altura = 1.55;
         
         //03) Para palavras -> String
         String nome = "Da Nave";
         
         System.out.println("Meu nome é "
                 + nome + ", tenho "
                 + idade + " anos de idade e "
                 + altura + "cm de altura");
         
         
         // Tipo Primitivo vs. Tipo Wrapper
         int inteiroPrimitivo;
         Integer inteiroWrapper;
         
         // Tipos Wrapper são classes, logo possuem métodos e variáveis
         // que vão ajudar :)
         
         //inteiroPrimitivo.
         //inteiroWrapper.
         
         //Outra diferença:
         //Tipo primitivo sempre tem um valor inicial
         //mesmo sem declarar.
         //Wrapper é null!
         //boolean boleanoPrimitivo;
         //Boolean boleanoWrapper;
         
         
    }
}
