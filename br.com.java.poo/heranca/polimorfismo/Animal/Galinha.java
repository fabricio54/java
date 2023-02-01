public class Galinha extends Animal{
    
    // acessando o construtor da super classe/classe pai
    public Galinha(double peso, String comida){
        super(peso, comida);
    }
    
    // polimorfismo: sobrescrevendo métodos
    @Override
    void fazerBarulho() {
        // TODO Auto-generated method stub
        System.out.println("Có, Có!");
    }
}
