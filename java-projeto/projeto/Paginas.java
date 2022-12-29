import java.util.Scanner;

public class Paginas implements GerenciadorPaginas{
    
    GerenciadorPaginas paginas;

    public void paginas(GerenciadorPaginas paginas){
        this.paginas = paginas;
    }

    @Override
    public void dentroPerfil() {
        this.pagina.dentroPerfil();
    }

    @Override
    public void dentroHome() {
        this.pagina.dentroHome();
    }

}
