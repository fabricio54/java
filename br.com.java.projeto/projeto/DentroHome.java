public class DentroHome implements GerenciadorPaginas{
    
    private String paginaAtual = "Home";
    private Paginas pagina;

    public DentroHome(Paginas pagina){
        this.pagina = pagina;
    }

    @Override
    public void dentroPerfil() {
        this.pagina.dentroPerfil(new DentroDoPerfil(this.pagina));
    }

    @Override
    public void dentroHome() {
        System.out.println("Ja se encontra na Home");
    }
    
}
