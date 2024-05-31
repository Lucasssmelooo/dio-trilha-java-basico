public class ResultadoEscolar3 {
    public static void main(String[] args) {
        double nota = 5.0;
        double notaDois = 7.6; 

        // Exemplo de atribuição com o operador ternário:
        String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // Exemplo de atribuição com operador ternário simulando uma condicional encadeada:
        String resultadoDois = (notaDois >= 7) ? "Aprovado" : (notaDois >= 5 && notaDois < 7) ? "Recuperação" : "Reprovado";
        System.out.println(resultadoDois);
    }
}
