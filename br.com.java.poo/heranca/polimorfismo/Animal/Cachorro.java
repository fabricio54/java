// usando o conceito de herança: temos que animal cachorro extende de animal todos os atributos que pertecem a classe genérica

// classe filha
public class Cachorro extends Animal{
    
    public Cachorro(double peso, String comida){
        super(peso, comida);
    }

    @Override
    void fazerBarulho() {
        System.out.println("Au, Au!");
    }
}
