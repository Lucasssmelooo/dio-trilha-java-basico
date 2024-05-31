public class PlanoOperadora {
    public static void main(String[] args) {
        /* De uma maneira geral, o "switch case" não agrega muita performance ao código em comparação
         * com o "if else" encadeado tradicional. Em alguns caso, no entanto, ele pode ser sim a melhor
         * escolha de estrutura para ser usada. Abaixo, um exemplo desses casos:
         */

        String plano = "B";

        switch(plano){
            case "T":{
                System.out.println("5GB de internet.");
            }case "M":{
                System.out.println("WhatsApp e Instagram grátis.");
            }case "B":{
                System.out.println("100 minutos de ligação.");
            }
        }
        /* O que acontece nesse exemplo acima é que, em nenhum "case", foi usado o comando "break".
         * Isso faz com que, a partir do momento em que um case é acionado, os de baixo também são.
         * Como a ideia do programa acima é mostrar os benefícios de cada plano de telefonia móvel,
         * e esses benefícios se repetem partindo dos melhores planos para os mais básicos, o switch
         * case evita a repetição de comandos (algo que seria necessário em um if else encadeado).
         */
    }
}
