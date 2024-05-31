public class ResultadoEscolar2 {
    public static void main(String[] args){
        double nota = 7.5;

        // Exemplo de condicionais encadeadas:
        if(nota >= 7){
            System.out.println("Aprovado");
        }else if (nota >= 5 && nota < 7){
            System.out.println("Prova de recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}
