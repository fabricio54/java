package OrientacaoObjetos.Interface;

public class Controle {
    
    private Card kard;

    public Controle(Card kard){
        this.kard = kard;
    }

    public void acelerar(){
        this.kard.acelerar();
    }

    public void freou(){
        this.kard.frear();
    }

    public void direcao(String sentido){
        this.kard.direcao(sentido);
    }

    public void bater(){
        this.kard.bater();
    }

    public void encontrarMoedas(){
        this.kard.encontrarMoedas();
    }
}
