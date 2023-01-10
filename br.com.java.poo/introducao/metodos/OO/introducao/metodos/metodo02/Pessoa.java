package OO.introducao.metodos.metodo02;

public class Pessoa {
    
    public String nome;
    public char sexo;
    public int idade;


    public Pessoa (String nome, char sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public Pessoa(){}

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Sexo: "+this.sexo);
    }
    

}
