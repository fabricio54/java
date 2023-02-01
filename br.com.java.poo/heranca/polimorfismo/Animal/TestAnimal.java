public class TestAnimal {
    
    // método estático da classe que recebe um animal e retorna o método fazer barulho definido para ele próprio
    public static void fazerBarulho(Animal animal){
        animal.fazerBarulho();
    }
    
    public static void main(String[] args){
        Animal cachorro = new Cachorro(23, "Carne");
        Animal galinha = new Galinha(33, "Milho");

        // como saber o tipo do objeto
        System.out.println(cachorro instanceof Cachorro);

        // métodos que por padrão ja existem ao criar sua classe
        
        // Método de comparação de objetos
        ////System.out.println(cachorro.equals(galinha)); // retorno um valor booleano
        //System.out.println(cachorro.hashCode());
        // retorna um número serial
        //System.out.println(cachorro.getClass());
        // retorn a classe a que pertence o objeto
        //System.out.println(cachorro.toString());
        // retorna a representação da string objeto
        
        // mesmos atributos
        /*cachorro.comida = "Ração";
        cachorro.peso = 23;

        galinha.comida = "Milho";
        galinha.peso = 2;
        
        // métodos iguais 
        cachorro.dormir();
        cachorro.fazerBarulho();

        galinha.dormir();
        galinha.fazerBarulho();
        */
        
        // com o polimorfismo eliminamos estrutruras condicionais
        fazerBarulho(cachorro);

    }
}
