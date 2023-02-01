package Matematica;

public class TestMatematica {

    public static void calcule(OperacaoMatematica z, double x, double y){
        System.out.println( z.calcular(x, y));
    }
    
    public static void main(String[] args){
        calcule(new Multiplicacao(), 3, 2);
    }
}
