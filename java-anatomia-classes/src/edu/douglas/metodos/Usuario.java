package douglas.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTv = new SmartTV();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.println(" Novo status -> TV ligada? " + smartTv.ligada);

    }
}