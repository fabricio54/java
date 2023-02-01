package ClassesAbstratas;

// com a palavra reservada abstract definimos que essa classe não estende de nenhuma outra (classe mais genérica)
public abstract class Animal {
    
    double peso;
    String comida;

    public Animal(double peso, String comida){
        this.peso = peso;
        this.comida = comida;
    }

    void dormir(){};
    void fazerBarulho(){};

}
