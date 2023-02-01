package OrientacaoObjetos.Interface;

public class Main {
    
    public static void main(String[] args){

        Card mario = new MarioKart();
        Controle controle1 = new Controle(mario);
        controle1.acelerar();
        controle1.encontrarMoedas();
        controle1.bater();
        controle1.direcao("esquerda");
        controle1.freou();
        controle1.encontrarMoedas();
        controle1.acelerar();
        controle1.bater();

        Card luigi = new Luigi();
        Controle controle2 = new Controle(luigi);
        controle2.acelerar();
        controle2.encontrarMoedas();
        controle2.bater();
        controle2.direcao("direita");
        controle2.freou();
        controle2.encontrarMoedas();
        controle2.acelerar();
        controle2.bater();

    }
}
