public class Comentarios {
    public static void main (String[] args){
        // Exemplo de comentário em uma única linha (deve-se usar duas barras).

        /* Exemplo de comentário
         * em mais de uma linha.
         * Deve-se usar barra estrela.
         */
    }

    /**
     *  Este é um exemplo de comentário de documentação (que serve para documentar algum elemento
     * do código - como métodos, por exemplo).
     * @param numeroUm Primeiro número inteiro que será somado
     * @param numeroDois Segundo número inteiro que será somado
     * @return retorna um número inteiro com a soma dos dois parâmetros passados.
     */

    public int soma(int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }
}
