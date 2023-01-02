package usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Perfil {
    private String nome;
    private String bio;
    private ArrayList<String> cartoesDeVisita = new ArrayList<String>();
    public ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();

    public Perfil(String nome, String bio){
        this.nome = nome;
        this.bio = bio;
        this.criaPerfil();
    }

    public void addCartao(String cartao){
        cartoesDeVisita.add(cartao);
    }

    public void addPublicacao(Publicacao publicacao){
        publicacoes.add(publicacao);
    }

    public void criaPerfil(){
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        int quant;

        System.out.println("Informe a quantidade de cartões a inserir: ");
        quant = n.nextInt();
        for(int i = 0; i < quant; i++){
            System.out.println("Cartão "+(i+1)+": ");
            this.addCartao(s.nextLine());
        }

        System.out.println("Informe a quantidade de publicações a inserir: ");
        quant = n.nextInt();
        for(int i = 0; i < quant; i++){
            System.out.println("Publicação "+(i+1));
            System.out.println("Informe o link e a tag da publicação na sequência: ");
            this.addPublicacao(new Publicacao(s.nextLine(), s.nextLine()));
        }
    }

    public void imprimeDados(){
        System.out.println("Dados da conta");
        System.out.println("Nome: "+this.nome);
        System.out.println("Bio: "+this.bio);
        System.out.println("Cartões de visita");
        for (String cartao : cartoesDeVisita) {
            System.out.println(cartao);
        }
        System.out.println("Publicações");
        for (Publicacao publicacao : this.publicacoes) {
            System.out.println("Link: "+publicacao.getLink());
            System.out.println("Tag: "+publicacao.getTag());
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setBio(String bio){
        this.bio = bio;
    }

    
}
