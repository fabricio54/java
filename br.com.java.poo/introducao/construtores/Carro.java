public class Carro{
    // Quando criamos um objeto e desejamos inicializalo devemos fazer isso no ato de criação do objeto.
    private String nome;
    private String modelo;
    private String motor;
    private double velocidadeMax;
    private String cor;

    // no java quando criamos o construtor do objeto usamos o mesmo nome da classe
    public Carro(String nome, String modelo, String motor, double velocidadeMax){
        this.nome = nome;
        this.modelo = modelo;
        this.motor = motor;
        this.velocidadeMax = velocidadeMax;
    }
    
    // construtor sem inicializações
    public Carro(){}
    
    // terceiro construtor geralmente usado quando se coloca um novo atributo em um projeto e adicionamos o construtor que recebe os valores dos atributos anteriores mais o novo valor de atributo
    public Carro(String nome, String modelo, String motor, double velocidadeMax, String cor){
        this(nome, modelo, motor, velocidadeMax);
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

}