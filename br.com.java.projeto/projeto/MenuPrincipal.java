import java.util.Scanner;

public class MenuPrincipal{
    public static void main(String[] args){
        int opcao = 1;
        Scanner s = new Scanner(System.in);
        while (opcao >= 1 && opcao <= 3){
            System.out.println("[ 1 ] Login\n[ 2 ] Cadastrar-se\n[ 3 ] Recuperar Senha");
            if (opcao == 1){
                System.out.println("Informe o Email: ");
                String email = s.nextLine();
                System.out.println("Informe a Senha: ");
                String senha = s.nextLine();
                Usuario usuario = new GerenciadorPerfis().buscarPerfil(email, senha);
                if (usuario != null){
                    
                }else{
                    System.out.println("email e senha errados ou usuario não existe");
                }
            }else if (opcao == 2){
                GerenciadorPerfis usuario = new GerenciadorPerfis();
                usuario.criarConta();
            }else if (opcao == 3){

            }
        }
    }
}
