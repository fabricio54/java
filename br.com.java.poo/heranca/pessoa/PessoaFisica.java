package OrientacaoObjetos.heranca;
// conceito de herança
// aplicamos o conceito de herança quando vemos que uma classe tem caracteristicas e metodos semelhantes ao da classe criada

// Obs: protect, limita o acesso a variavel as classes filhas

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(){}
    
    // podemos usar o polimorfismo sem o conceito da herança
    public PessoaFisica(String nome, int id){
        super(nome, id);
    }
    
    // Quando utilizamos herança automaticamente herdamos caracteristicas e métodos da super classe (clasee herdada) e referênciamos como super(parâmentros do construtor da super classe)
    public PessoaFisica(String nome, int id, String cpf ){
        super(nome, id);
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    // sobre carga de função: herança e polimorfismo
    public void imprimir(){
        super.imprimirDados();
    }

    public void imprimir(String cpf){
        super.imprimirDados();
        System.out.println(" Cpf: "+this.cpf);
    }
}
