public class ArrayComFor {
    public static void main(String[] args){
        // Exemplo do uso do laço FOR junto com "coleções" (no caso, um array de Strings)
        String alunos[] = {"Pedro", "Caio", "Ana", "Rebeca"};

        for(int x=0; x < alunos.length; x++){
            System.out.println("O aluno na posição " + x + " é: " + alunos[x]);
        }
        
        // Agora, uma versão simplificada do laço FOR para ser usado com coleções:
        System.out.println("\nAgora, com a versão simplificada:");

        int aux = 0;
        // Basta criar uma variável local do mesmo tipo do array. A cada iteração, essa variável
        // vai assumir uma posição do array:
        for(String aluno : alunos){
            System.out.println("O aluno na posição " + aux + " é: " + aluno);
            aux++;
        }
    }
}
