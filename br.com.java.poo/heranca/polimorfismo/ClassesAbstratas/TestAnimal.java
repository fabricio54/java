package ClassesAbstratas;

public class TestAnimal {
    
    // método estático da classe TestAnimal que recebe uma instancia de um animal e que retornará seu método específico
    public static void animalFazerBarulho(Animal animal){
        animal.dormir();
        animal.fazerBarulho();
    }
    
    public static void main(String[] args){
        animalFazerBarulho(new Galinha(10, "carijo"));
    }
}
