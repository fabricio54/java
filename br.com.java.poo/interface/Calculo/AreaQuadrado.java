// para implementarmos uma interface utilizamos a palavra reservado implements
public class AreaQuadrado implements AreaCalculavel{
    
    double lado;

    public AreaQuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        // TODO Auto-generated method stub
        return this.lado * this.lado;
    }
}
