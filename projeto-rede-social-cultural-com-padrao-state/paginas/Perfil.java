public class Perfil implements Paginas{
    private MudarPagina perfil;

    public Perfil(MudarPagina perfil){
        this.perfil = perfil;
    }

    @Override
    public void home() {
        this.perfil.setMudarPagina(new Home(this.perfil));
    }

    @Override
    public void perfil() {
        System.out.println("Atualmente na Pagina do Perfil");
    }
    
}
