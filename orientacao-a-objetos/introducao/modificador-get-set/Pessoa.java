public class Pessoa {
    // modificadores de acesso diz respeito ao acesso aquele atributo ou mesmo função de objeto modelado. public -> todas as classes tem acesso, private -> so pode ser acessado dentro do próprio objeto, protect -> pode ser utilizado em um mesmo pacote, void -> é livre para acesso.
    private String nome;
    private int idade;

    // Apartir do momento em que limitamos o acesso a esses atributos, podemos criar os métodos get e set para acessalos indiretamente.

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}