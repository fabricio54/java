public class Home implements Paginas{
    private MudarPagina home;

    public Home(MudarPagina home){
        this.home = home;
    }

    @Override
    public void home() {
        System.out.println("Atualmente na Página Principal");
    }

    @Override
    public void perfil() {
        // TODO Auto-generated method stub
        
    }
    
}
