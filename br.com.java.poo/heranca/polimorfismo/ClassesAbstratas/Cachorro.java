package ClassesAbstratas;

public class Cachorro extends Animal{
    
    public Cachorro(double peso, String comida){
        super(peso, comida);
    }

    void dormir(){
        System.out.println("Cachorro Dormiu!");
    }

    void fazerBarulho(){
        System.out.println("Au, Au!");
    }
    
}
