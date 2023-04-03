public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    //Criando os métodos
    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume (){
        volume--;
        System.out.println("Diminuir volume para: "+ volume);
    }

    public void novoCanal(int novoCanal){
        canal=novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Novo canal"+ canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Novo canal"+ canal);
    }


}
