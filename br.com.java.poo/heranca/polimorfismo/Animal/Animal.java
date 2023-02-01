// classe pai: a classe mais genérica e que vai ter caracteristicas e métodos de qualquer animal

// classe pai
public class Animal {
    
    // private int serial; não pode ser acessado pelas classes filhas
    double peso;
    String comida;

    public Animal(double peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }

    void dormir(){
        System.out.println("Dormiu");
    }

    void fazerBarulho(){
        System.out.println("Fazer Barulho");
    }
}
