public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Status da tv: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Status da tv: " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: "+smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.novoCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);











    }
}
