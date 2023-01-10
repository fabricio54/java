package OrientacaoObjetos.Interface;

public class MarioKart implements Card{

    private int pontos;

    @Override
    public void acelerar() {
        System.out.println("Mario Kart em movimento!");
    }

    @Override
    public void frear(){
        System.out.println("Mario Kart parou!");
    }

    @Override
    public void direcao(String sentido){
        System.out.println("Mario Kart Virou a"+sentido);
    }
    
    @Override
    public void bater(){
        pontos -= 100;
        System.out.println("Mario Kart Bateu! Perdeu 100 pontos");
        System.out.println("Pontuação: "+pontos);
    }

    @Override
    public void encontrarMoedas(){
        pontos += 100;
        System.out.println("Mario Kart Ganhou 100 pontos!");
        System.out.println("Pontuação: "+pontos);
    }

}
