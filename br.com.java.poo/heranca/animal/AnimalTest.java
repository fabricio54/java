public class AnimalTest {
    public static void main(String[] args){
        Animal cachorro = new Cachorro();
        Animal galinha = new Galinha();
        
        // mesmos atributos
        cachorro.comida = "Ração";
        cachorro.peso = 23;

        galinha.comida = "Milho";
        galinha.peso = 2;
        
        // métodos iguais 
        cachorro.dormir();
        cachorro.fazerBarulho();

        galinha.dormir();
        galinha.fazerBarulho();
        
    }
}
