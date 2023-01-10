public class Home {
    
    public void curtir(){
        new GerenciadorPublicacoes().exibirPublicacoes();
        Publicacao publicacao = new GerenciadorPublicacoes().selecionarPublicacao();
        System.out.println("Você curtiu a publicação de link: "+publicacao.getLink());
        System.out.println("e tag: "+publicacao.getTag());
        new GerenciadorPublicacoes().curtirPublicacao(publicacao);
    }

    public void descurtir(){
        Publicacao publicacao = new GerenciadorPublicacoes().selecionaPublicacaoCurtida();
        System.out.println("Descurtiu a publicação de link: "+publicacao.getLink());
        System.out.println("e tag"+publicacao.getTag());
        new GerenciadorPublicacoes().excluirPublicacaoCurtida(publicacao);
    }

    public void visitarPerfil(Usuario usuario){
        usuario.perfil.imprimeDados();
    }
}
