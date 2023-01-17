package variaveisEstaticas;

public class Galinha {
    public static int totalOvosDaGranja;
    public int ovos;

    /* retornando a própria classe galinha depois de acrescentar um valor a variável */
    public Galinha botar(){
        this.ovos++;
        Galinha.totalOvosDaGranja++;
        return this;
    }

    public static double media(int galinhas){
        return (totalOvosDaGranja / galinhas);
    }

}
