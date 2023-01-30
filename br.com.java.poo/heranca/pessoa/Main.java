package OrientacaoObjetos.heranca;

public class Main {

    public static void main(String[] args){

        PessoaFisica pf = new PessoaFisica("Carlos", 32, "2234");
        
        pf.imprimir();
        pf.imprimir(pf.getCpf());
    }
    
}
