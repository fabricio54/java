// Herança Multipla
public class Cubo implements VolumeCalculavel, AreaCalculavel{

    double lado;

    public Cubo(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calculaVolume() {
        // TODO Auto-generated method stub
        return 6 * lado;
    }

    @Override
    public double calculaArea() {
        // TODO Auto-generated method stub
        return lado * lado;
    }
}
