import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        // Exemplo simples do uso do laço "while"
        double mesada = 50.0;
        while(mesada > 0){
            double valorDoce = gerarValorAleatorio();
            if(mesada < valorDoce){
                break;
            }
            System.out.println("Doce no valor de R$" + valorDoce + " adicionado ao carrinho.");
            mesada = mesada - valorDoce;
        }
        System.out.println("Valor final da mesada: R$" + mesada);

    }
    public static double gerarValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
