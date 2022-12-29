import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorPublicacoes {

    private static ArrayList<Publicacao> publicacoesDoSistema = new ArrayList<Publicacao>();
    private static ArrayList<Publicacao> publicacoesCurtidas = new ArrayList<Publicacao>();
    
    public void novaPublicacao(Publicacao publicacao){
        GerenciadorPublicacoes.publicacoesDoSistema.add(publicacao);
    }

    public void curtirPublicacao(Publicacao publicacao){
        GerenciadorPublicacoes.publicacoesCurtidas.add(publicacao);
    }
    
    public void exibirPublicacoes(){
        System.out.println("----- Publicações do Sistema -----");
        for (Publicacao publicacao : GerenciadorPublicacoes.publicacoesDoSistema) {
            publicacao.imprimePublicacao();
        }
    }

    public void exibirPublicacoesCurtidas(){
        System.out.println("----- Publicações do Sistema -----");
        for (Publicacao publicacao : GerenciadorPublicacoes.publicacoesCurtidas) {
            publicacao.imprimePublicacao();
        }
    }

    public Publicacao selecionarPublicacao(){
        this.exibirPublicacoes();
        System.out.println("informe o link e a tag da publicação de deseja selecionar: ");
        Scanner s = new Scanner(System.in);
        String link = s.nextLine();
        String tag = s.nextLine();
        for (Publicacao publicacao : GerenciadorPublicacoes.publicacoesDoSistema) {
            if (publicacao.getLink() == link && publicacao.getTag() == tag){
                return publicacao;
            }
        }return null;
    }

    public Publicacao selecionaPublicacaoCurtida(){
        this.exibirPublicacoesCurtidas();
        System.out.println("informe o link e a tag da publicação de deseja selecionar: ");
        Scanner s = new Scanner(System.in);
        String link = s.nextLine();
        String tag = s.nextLine();
        for (Publicacao publicacao : GerenciadorPublicacoes.publicacoesCurtidas) {
            if (publicacao.getLink() == link && publicacao.getTag()== tag){
                return publicacao;
            }
        }return null;
    }

    public void exibePublicacoesCurtidas(){
        for (Publicacao publicacao : GerenciadorPublicacoes.publicacoesCurtidas) {
            publicacao.imprimePublicacao();
        }
    }

    public void excluirPublicacaoCurtida(Publicacao publicacao){
        GerenciadorPublicacoes.publicacoesCurtidas.remove(publicacao);
    }
}
