package OrientacaoObjetos.heranca;

public class PessoaJuridica extends Pessoa{

    private int cnpj;

    public PessoaJuridica(){}
    
    // Quando utilizamos herança automaticamente herdamos caracteristicas e métodos da super classe (clasee herdada) e referênciamos como super(parâmentros do construtor da super classe)
    

    // podemos usar o polimorfismo sem o conceito da herança
    public PessoaJuridica(String nome, int id){
        super(nome, id);
    }

    public PessoaJuridica(String nome, int id, int cnpj){
        super(nome, id);
        this.cnpj = cnpj;
    }

    public int getCnpj(){
        return cnpj;
    }

    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
    
    // sobrecarga de funções: herança e polimorfismo

    public void imprimir(){
        super.imprimirDados();
    }

    public void imprimir(String cnpj){
        super.imprimirDados();
        System.out.print(" Cnpj: "+this.cnpj);
    }

}
