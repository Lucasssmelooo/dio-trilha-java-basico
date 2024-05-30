public class AboutMe {
    public static void main(String[] args){
        /*Exemplo de como podem ser passados argumentos diretamente pelo terminal.
         * Nesse caso, os argumentos são manipulados e usados dentro do código.
         * Os argumentos devem ser passados como um array de Strings (sempre começando
         * no índice [0]).
        */

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, eu me chamo " + nome + " " + sobrenome);
        System.out.println("Eu tenho " + idade + " anos de idade");
        System.out.println("Minha altura é: " + altura + "cm");
    }
}
