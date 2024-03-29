public class AnimalTest {
    public static void main(String[] args){
        Animal cachorro = new Cachorro(23, "Carne");
        Animal galinha = new Galinha(33, "Milho");

        // como saber o tipo do objeto
        System.out.println(cachorro instanceof Cachorro);
        System.out.println(cachorro instanceof Galinha);

        // métodos que por padrão ja existem ao criar sua classe
        
        // Método de comparação de objetos
        System.out.println(cachorro.equals(galinha)); // retorno um valor booleano
        System.out.println(cachorro.hashCode());
        // retorna um número serial
        System.out.println(cachorro.getClass());
        // retorn a classe a que pertence o objeto
        System.out.println(cachorro.toString());
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

    }
}
