package danave.primeiro.projeto.nivelamento;
import java.util.Scanner;


/**
 *
 * @author Leonardo
 */
public class LeituraEscrita {
    public static void main(String[] args) {
        //Precisamos criar um leitor
        //Para isso usaremos a classe Scanner
        //Mas não vai ser uma variável, e sim um OBJETO
        
        //Criamos uma instância usando o "new"
        //que serve para transformar leitor em um OBJETO
        //e não uma simples variável
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: " );
        String nomeDigitado = leitor.nextLine();
        
        System.out.println("Digite sua idade:");
        Integer idadeDigitada = leitor.nextInt();
        
        System.out.println("Digite sua altura:");
        Double alturaDigitada = leitor.nextDouble();
        
        System.out.println("O nome digitado foi: " + nomeDigitado + " =D");
        System.out.println("A idade digitada foi: " + idadeDigitada + " anos");
        System.out.println("A altura digitada foi: " + alturaDigitada + "cm");
    
    }
}
