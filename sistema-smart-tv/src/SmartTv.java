public class SmartTv {
    // Atributos da SmartTV:
    static boolean ligada = false;
    static int canal = 1;
    static int volume = 25;

    // Métodos para manipular o estado da SmartTV:
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuinddo o volume para: " + volume);
    }

    public void subirCanal(){
        canal++;
        System.out.println("Mudando para o canal: " + canal);
    }

    public void descerCanal(){
        canal--;
        System.out.println("Mudando para o canal: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
