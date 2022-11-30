public class Funcionario{
    
    private String nome;
    private int idade;
    private float []salarios = new float[3];

    public Funcionario(String nome, int idade, float... salarios){
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }

    public void imprimeDados(){
        System.out.println("------ Dados Funcionário ------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.print("Salários:");
        for(int i = 0; i < this.salarios.length; i++){
            System.out.print(" R$ "+this.salarios[i]+",");
        }
        System.out.println();
    }

    public void mediaSalarios(){
        double soma = 0;
        double media = 0;
        for(double salario: this.salarios){
            soma += salario;
        }
        media = soma / (this.salarios.length);
        System.out.println("Média dos salários: "+media);
    }
}