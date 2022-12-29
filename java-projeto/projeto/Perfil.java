import java.util.ArrayList;
import java.util.Scanner;

public class Perfil {
    private String nome;
    private String bio;
    private ArrayList<String> cartaoDeVisita = new ArrayList<String>();
    private String tag;
    private ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();

    public Perfil(String nome, String bio, String tag){
        this.nome = nome;
        this.bio = bio;
        this.tag = tag;
    }

    public void imprimeDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Bio: "+this.bio);
        System.out.println();
        this.imprimeCartoesDeVisita();
        System.out.println();
        this.imprimePublicacoes();
    }

    public void imprimeCartoesDeVisita(){
        if (this.cartaoDeVisita != null){
            for (String cartao : cartaoDeVisita) {
                System.out.println("---- Cartão ----");
                System.out.println(cartao);
            }System.out.println();
        }else{
            System.out.println("Ainda não foi inserido cartões de visita");
        }
    }

    public void imprimePublicacoes(){
        if (this.publicacoes != null) {
            for(Publicacao publicacao : publicacoes) {
                publicacao.imprimePublicacao();
            }
        }else {
            System.out.println("Ainda não foram feitas publicações");
        }
    }

    public void editar(){
        this.editarPerfil();
    }

    private void editarPerfil(){
        Scanner s = new Scanner(System.in);
        int opcao = 1;
        while (opcao >= 1 && opcao <= 5) {
            System.out.println("[ 1 ] Mudar nome\n[ 2 ] atualizar bio\n[ 3 ] atualizações nos cartões de visita\n[ 4 ] atualizar tag\n[ 5 ] atualizar Publicações");
            opcao = s.nextInt();
            if (opcao == 1){
                System.out.println("Informe o nome: ");
                this.setNome(s.nextLine());
            }else if(opcao == 2){
                System.out.println("Atualize a bio: ");
                this.setBio(s.nextLine());
            }else if (opcao == 3) {
                System.out.println("atualizar bio: ");
                this.setBio(s.nextLine());
            }else if (opcao == 4) {
                System.out.println("[ 1 ] adicionar cartão\n[ 2 ] excluir cartão");
                int opcao2 = s.nextInt();
                while (opcao2 == 1 && opcao2 == 2){
                    System.out.println("Informe o cartão: ");
                    if (opcao2 == 1){
                        this.adicionaCartao(s.nextLine());
                    }else if (opcao2 == 2){
                        this.excluirCartao(s.nextLine());
                    }
                }
            }
            else if(opcao == 5){
                System.out.println("[ 1 ] para excluir cartao\n[ 2 ] inserir novo cartão");
                int opcao3 = s.nextInt();
                while (opcao3 >= 1 && opcao3 <= 2){
                    System.out.println("Informe o link e a tag na sequência: ");
                    if (opcao3 == 1){
                        this.excluirPublicacao(s.nextLine(), s.nextLine()); 
                    }else if (opcao3 == 2){
                        this.adicionaPublicacao(s.nextLine(), s.nextLine());
                    }else{
                        System.out.println("Opção Inválida! tente novamente.");
                    }
                }
            }else{
                System.out.println("Opção inválida!");
            }
        }
    }

    public void adicionaPublicacao(String link, String tag){
        this.publicacoes.add(new Publicacao(link, tag));
    }
    
    public void adicionaCartao(String cartao){
        this.cartaoDeVisita.add(cartao);
    }

    private void excluirCartao(String cartao){
        if (this.cartaoDeVisita != null){
            for (String c : cartaoDeVisita) {
                if (c == cartao){
                    this.cartaoDeVisita.remove(c);
                }
            }
        }else{
            System.out.println("Não existe o cartão informado!");
        }
    }

    private void excluirPublicacao(String link, String tag){
        if (this.publicacoes != null){
            for (Publicacao publicacao : this.publicacoes) {
                if (publicacao.getLink() == link && publicacao.getTag() == tag){
                    this.publicacoes.remove(publicacao);
                }
            }
        }else{
            System.out.println("Publicação não existe!");
        }
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setBio(String bio){
        this.bio = bio;
    }

    public void setTag(String tag){
        this.tag = tag;
    }

}
