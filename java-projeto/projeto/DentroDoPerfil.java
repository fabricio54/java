import java.util.Scanner;

public class DentroDoPerfil implements GerenciadorPaginas{
    private String paginaAtual = "Perfil";
    private Paginas pagina;

    public DentroDoPerfil(Paginas pagina){
        this.pagina = pagina;
    }
    
    private void editarPerfil(){
        this.usuario.perfil.editar();
    }

    private void config(){
        Scanner s = new Scanner(System.in);
        int opcao = 1;
        while (opcao != 1 && opcao != 2){
            System.out.println("[ 1 ] excluir conta \n[ 2 ] alterar tema");
            opcao = s.nextInt();
            if (opcao == 1){
                new GerenciadorPerfis().excluirConta(usuario.getEmail().usuario.getSenha());
            }else if (opcao == 2){
                System.out.println("Tema alterado com sucesso!");
            }else{
                System.out.println("Opção inválida!");
            }
        }
    }

    private void publicar(){
        
    }

    @Override
    public void dentroPerfil() {
        System.out.println("Ja está na Pagina Perfil");
    }

    @Override
    public void dentroHome() {
        this.pagina.dentroHome(new DentroHome(this.pagina));
    }
}
