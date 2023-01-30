package construtores;

public class TestCarro {
    public static void main(String[] args){
        Carro ferrari = new Carro();
        ferrari.modelo = "ferrari Enzo";
        ferrari.velocidadeMaxima = 349;
        ferrari.velocidadeIntervaloZeroACem= 2.9;

        Carro fiat = new Carro("Fiat Uno", 350, 2.5);

        
    }
}
