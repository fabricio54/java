public class Anime{

    private String nome;
    private int[] episodios;
    
    // bloco de inicialização do java vem antes mesmo do construtor
    {
        System.out.println("Dentro do bloco de inicialização");
    }
    
    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        this.episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        for(int episodio: episodios){
            System.out.print(episodio + " ");
        }
    }
}