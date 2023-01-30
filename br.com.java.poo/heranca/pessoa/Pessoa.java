package OrientacaoObjetos.heranca;

public class Pessoa {
    
    private String nome;
    private int id;

    public Pessoa(){

    }

    public Pessoa(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void imprimirDados(){
        System.out.print(" Nome: "+this.nome+" Id: "+this.id);
    }
    
}
