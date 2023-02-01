package ClassesAbstratas;

public class Galinha extends Animal {
    
    public Galinha(double peso, String comida){
        super(peso, comida);
    }

    void dormir(){
        System.out.println("Galinha Dormiu!");
    }

    void fazerBarulho(){
        System.out.println("Có, Có!");
    }
}
