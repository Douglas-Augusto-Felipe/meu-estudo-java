package douglas.metodos;

public class SmartTV{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarCanal(){
        canal++;

    }

    
    public void diminuirVolumeCanal(){
        canal--;

    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }

    public void aumentarVolume(){
         volume++; //volume= volume+1;
         System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--; // volume = volume-1;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = true;
    }
}