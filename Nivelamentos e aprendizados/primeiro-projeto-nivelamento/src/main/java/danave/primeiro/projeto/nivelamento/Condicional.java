package danave.primeiro.projeto.nivelamento;

/**
 *
 * @author Leonardo
 */
public class Condicional {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 42;
        
        // < Menor
        // > Maior
        // >= Maior igual
        // <= Menor igual
        // && E
        // || Ou
        // .equals para ver se é igual (==)
        // (Não usar "==" para comparar Strings)
        
        if(numero01 > numero02){
            System.out.println("É maior!");
        } else if(numero01 < numero02){
            System.out.println("É menor!");
        } else if (numero01 == numero02) {
            System.out.println("É igual!");
        }
        
        Boolean bloqueado = false; //Imagine que isso vem do banco
        
        if(bloqueado) {
            System.out.println("Tá bloqueado.");
        } else {
            System.out.println("Tá desbloqueado.");
        }
        
        String nome01 = "Xampson";
        String nome02 = "xampson";
        
        // SENsitive case
        
        if(nome01.equals(nome02)) {
            System.out.println("Nome igual!");
        } else {
            System.out.println("Nome diferente!");
        }
        
        // INSENsitive case
        
        if(nome01.equalsIgnoreCase(nome02)) {
            System.out.println("Nome igual!");
        } else {
            System.out.println("Nome diferente!");
        }
        
    }
}
