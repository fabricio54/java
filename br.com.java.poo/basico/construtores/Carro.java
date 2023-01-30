package construtores;

public class Carro {
    
    String modelo;
    int velocidadeMaxima;
    double velocidadeIntervaloZeroACem;

    /* iniciamos um construtor como inicializamos um método. mais chamamos ele pelo mesmo nome que demos a classe */

    /* Podemos Inicializarmos de duas maneiras: vazio como vem padrão ao inicializarmos ou ja definindo valores nos parâmetros */
    public Carro(){

    }

    public Carro(String modelo, int velocidadeMaxima, double velocidadeIntervaloZeroACem){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeIntervaloZeroACem = velocidadeIntervaloZeroACem;
    }
}
