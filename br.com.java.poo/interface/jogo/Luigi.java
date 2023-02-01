package OrientacaoObjetos.Interface;


public class Luigi implements Card{

    private int pontos;


    @Override
    public void acelerar() {
        System.out.println("Luigi acelerou o carro!");
    }

    @Override
    public void frear() {
        System.out.println("Luigi freou o carro!");
    
    }

    @Override
    public void direcao(String sentido) {
        System.out.println("Luigi Virou á "+sentido);
    }

    @Override
    public void bater() {
        System.out.println("Luigi Bateu! Perdeu 100 pontos ");
        System.out.println("Pontuação: "+pontos);

    }

    @Override
    public void encontrarMoedas() {
        System.out.println("Luigi Ganhou 100 pontos");
        System.out.println("Pontuação: "+pontos);
    }
    
}
