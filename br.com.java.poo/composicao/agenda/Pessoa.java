package OrientacaoObjetos.composicao;

// Orientação a objetos: icialização
public class Pessoa {
    // modificadores de acesso: public, private
    
    // encapsulamento
    private String nome;
    private int idade;
    private Agenda agenda;

    // Construtores do objeto (sobrecarga do construtor)
    public Pessoa(){
        nome = "-";
        idade = 0;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    // Métodos do objeto

    // Métodos: retorno do valor do atributo
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    // Métodos: Mudar valores dos atributos

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    
    // metodo de apresentação dos atributos
    public void exibirValor(){
        System.out.println("Nome: "+nome+" Idade: "+idade);
    }

    public void setAgenda(Agenda a){
        this.agenda = a;
    }
    
    public void mostrarAgendamento(){
        this.agenda.mostrarAgenda();
    }
}
