public class Anime{

    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    
    // Antes de entender o conceito de construtores, vamos fazer metodos que recebem os valores e atribui as variaveis.
    
    // No exemplo asseguir estamos tratando de sobrecarga de metodos. como funciona? simplesemente quando chamamos o método dependendo dos parâmetros passados uma função ou outra devera ser ativada.

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    
    // método com o mesmo nome mais com parâmetros ou tipos diferentes
    public void init(String nome, String tipo, String genero, int episodios){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprimeDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Episodios: "+this.episodios);
        if(this.genero != null){
            System.out.println("Genero: "+this.genero);
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

}