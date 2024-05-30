public class Operadores {
    public static void main (String[] args){
        // Operador "+" enquanto elemento concatenador:
        /*String primeiroNome = "Linguagem";
        String segundoNome = "Java";
        //System.out.println(primeiroNome + " " + segundoNome);

        // Exemplo do uso do "+" para concatenar e somar ao mesmo tempo.
        // Toda vez que aparece uma String na operação, o Java passa a realizar apenas concatenações.
        String concatenacao;
        concatenacao = 8 + 2 + "5" + (2 + 3) + "4";
        System.out.println(concatenacao);*/

        // Operadores unários:
        int numero = +5;
        numero = -numero;
        
        // Esta é a maneira de tornar um número negativo em positivo em Java (multiplicando por -1):
        //System.out.println(numero * -1);

        /* Operadores unários de incremento e decremento:
           ++ (adiciona um número) e -- (decrementa um número)
           Mas é importante ficar atento ao momento de usar o incremento/decremento, poi a operação sempre
           é realizada na ordemda esquerda para a direita.
           Ex.:
            int meuNumero = 5;
            meuNumero++; --> primeiro lê o número e só depois o incrementa.
            ++meuNumero; --> primeiro incrementa o número e depois o lê.
        */

        /* Alterando o um valor booleano com o operador !:
           Para realizar a mudança em um valor booleano, basta colocar o ! como prefixo da variável.
           EX.: boolean minhaVariavel = true;
                minhaVariavel = !minhaVariavel; --> recebe ela mesma com o valor invertido.
           System.out.println(!minhaVariavel); --> apenas printa a variável com o valor invertido (sem alterá-la
           de fato).
         */

        // Operador ternário --> Ele é uma simplificação de uma estrutura condicional.

        int a = 6;
        int b = 5;
        String resultado = "";
        /*
        - Estrutura condicional padrão: 
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        - Versão simplificada (usando operador ternário):
        */
        resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
