package OO.introducao;

public class Pessoa {
    // atributos

    // sintaxe a ser usada para criação dos atributos
    // moficador de acesso (public private protect void) / tipo do atributo (String char byte short int long float double boolean) / nome da variável

    private String nome;
    private int idade;
    private char sexo;

    // para inicializarmos um objeto com essas caracteristicas precizamos de um construtor que receba os valores e atribua as variáveis
    
    // temos dois tipos de construtores: o que apenas inicializamos com valores padrões e o que recebe os valores na inicialização da variável
    
    // construtor padrão
    public Pessoa (){}
    
    // construtor com os valores passados na criação da instância
    public Pessoa (String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    // Quando optamos criar os atributos com modificadores privados obrigatoriamente temos que criar métodos que acessem os mesmos dentro da classe sem permissão para fora da classe

    // métodos que retorna o valor do atributo

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public char getSexo(){
        return sexo;
    }

    // métodos que modificam os valores dos atributos e não retornam nada

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
}