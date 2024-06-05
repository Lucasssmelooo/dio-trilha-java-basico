import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        // Exemplo do uso do "do while". A diferença dele para o "while" é que ele sempre executa
        // o bloco de comando pelo menos uma vez.
        System.out.println("Discando...");
        do{
            System.out.println("Telefone tocando.");
        }while(tocando());
        System.out.println("Alô!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? -> " + atendeu);
        return !atendeu;
    }
}
