package funcionario;

public class Funcionario {
    
    private String nome;
    private double salario;
    private boolean ativo;
    private String senha;
    
    /* construtor sem parâmetros */
    public Funcionario(){

    }

    public Funcionario(String nome, double salario, boolean ativo, String senha){
        this.nome = nome;
        this.salario = salario;
        this.ativo = ativo;
        this.senha = senha;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public boolean isAtivo(){
        return this.ativo;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
}
