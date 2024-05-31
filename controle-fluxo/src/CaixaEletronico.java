public class CaixaEletronico {
    public static void main(String[] args){
        double saldo = 25.0;
        double saqueSolicitado = 16.0;

        //  Exemplo de condicional simples:
        if (saqueSolicitado <= saldo){
            saldo = saldo - saqueSolicitado;
            System.out.println("Saque realizado.");
        }
        
        System.out.println(saldo);
    }
}