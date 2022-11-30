package OO.introducao;

import javax.swing.plaf.synth.SynthToolBarUI;

public class PessoaTest {
    public static void main(String[] args){
        // criação da instância pessoa
        Pessoa pessoa = new Pessoa("Lili", 23, 'F');

        // acessando os métodos da classe pessoa

        // métodos que retornam o valor do atributo
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getSexo());

        // modificando os valores das variáveis
        pessoa.setNome("Gilberto");
        pessoa.setIdade(34);
        pessoa.setSexo('M');

        // imprimindo novamente os valores atualizados
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getSexo());
    }
}
