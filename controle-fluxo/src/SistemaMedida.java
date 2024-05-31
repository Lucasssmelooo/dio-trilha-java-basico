public class SistemaMedida {
    public static void main(String[] args){
        // Exemplo do uso da estrutura "Switch Case" (que, basicamente, substitui o "if else" encadeado):
        String medida = "M";

        switch (medida){
            case "P":{
                System.out.println("Pequeno");
                break;
            }case "M":{
                System.out.println("Médio");
                break;
            }case "G":{
                System.out.println("Grande");
                break;
            }default:{
                System.out.println("Indefinido");
            }
        }
        /*
        Esse código acima com o uso do "switch case" serve para substituir, por exemplo, esse tipo de construção com "if else" encadeados:

        if (medida == "P"){
            System.out.println("Pequeno");
        }else if (medida == "M"){
            System.out.println("Médio");
        }else if (medida  == "G"){
            System.out.println("Grande");
        }else{
            System.out.println("Indefinido");
        }
        */
    }
}
