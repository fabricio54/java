public class Carro {
    
    String modelo;
    int velocidadeMaxima;
    double velocidadeIntervaloZeroACem;
    Motor motor;

    public Carro(String modelo, int velocidadeMaxima, double velocidadeIntervaloZeroACem, String tipo, int potencia){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeIntervaloZeroACem = velocidadeIntervaloZeroACem;
        this.motor = new Motor(tipo, potencia);
    }

}
