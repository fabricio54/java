import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.plugins.tiff.TIFFTagSet;

public class GerenciadorPerfis {
    private static ArrayList<Usuario> usuariosApp = new ArrayList<Usuario>();

    public void adicionaConta(Usuario usuario){
        GerenciadorPerfis.usuariosApp.add(usuario);
    }

    public int totalContas(){
        return GerenciadorPerfis.usuariosApp.size();
    }

    public void criarConta(){
        String email, senha;
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o Email: ");
        email = s.nextLine();
        System.out.println("Crie uma Senha: ");
        senha = s.nextLine();
        Usuario usuario = new Usuario(email, senha, this.informacoes());
        this.adicionaConta(usuario);
    }

    private Perfil informacoes(){
        String nome, bio, tag, link, tag_alter;
        int quant;
        ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        nome = s.nextLine();
        
        System.out.println("Descreva sua bio: ");
        bio = s.nextLine();

        System.out.println("Informe a tag: ");
        tag = s.nextLine();

        Perfil perfil = new Perfil(nome, bio, tag);

        System.out.println("Informe quantos cartões de visita deseja inserir: ");
        quant = s.nextInt();
        for(int i = 0; i < quant; i++){
            System.out.println("Descreva o "+(i+1)+"º cartão: ");
            perfil.adicionaCartao(s.nextLine());
        }
        
        System.out.println("Informe quantas publicações deseja inserir: ");
        quant = s.nextInt();
        for(int i = 0; i < quant; i++){
           System.out.println("---- Publicação "+(i+1)+" ----");
           System.out.println("Link: ");
           link = s.nextLine();
           System.out.println("Tag: ");
           tag_alter = s.nextLine();
           perfil.adicionaPublicacao(link, tag_alter);
           new GerenciadorPublicacoes().novaPublicacao(new Publicacao(link, tag));
        }

        return perfil;
    }

    public Usuario buscarPerfil(String email, String senha){
        if (GerenciadorPerfis.usuariosApp != null){
            for (Usuario usuario : GerenciadorPerfis.usuariosApp) {
                if ( usuario.getEmail() == email && usuario.getSenha() == senha){
                    return usuario;
                }
            }return null;
        }return null;
    } 

    public void recuperaSenha(String email){
        Scanner s = new Scanner(System.in);
        if (GerenciadorPerfis.usuariosApp != null){
            for (Usuario usuario : GerenciadorPerfis.usuariosApp) {
                if (usuario.getEmail() == email){
                    System.out.println("Informe a nova Senha: ");
                    usuario.setSenha(s.nextLine());
                }
            }
        }else{
            System.out.println("Email de Usuario invalido ou não existente");
        }
    }

    public void excluirConta(String email, String senha){
        if (GerenciadorPerfis.usuariosApp != null){
            for (Usuario usuario : GerenciadorPerfis.usuariosApp) {
                if (usuario.getEmail() == email && usuario.getSenha() == senha ) {
                    GerenciadorPerfis.usuariosApp.remove(usuario);
                }
            }
        }
    }


}
