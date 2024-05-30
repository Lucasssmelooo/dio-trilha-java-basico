public class Usuario {
    public static void main(String[] args) throws Exception {
        
        // Criando um novo objeto baseado na SmartTV:
        SmartTv smarTv = new SmartTv();

        // Aumentando o volume dela usando laço de repetição e métodos criados na outra classe:
        for(int i=0; i<3; i++){
            smarTv.aumentarVolume();
        }

        //Mudando de canal:
        smarTv.mudarCanal(48);

        System.out.println("TV ligada? -> " + SmartTv.ligada);
        System.out.println("Em qual canal está -> " + SmartTv.canal);
        System.out.println("Qual o atual volume? -> " + SmartTv.volume);

        smarTv.ligar();

        System.out.println("TV ligada? -> " + SmartTv.ligada);

    }
}
