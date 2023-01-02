package gerenciadores;

import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

import usuario.Usuario;

public class GerenciadorPerfis {

    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public void criaConta(){
        Scanner s = new Scanner(System.in);
        this.addConta(new Usuario().criaUsuario());
    }

    public int totalContas(){
        return usuarios.size();
    }

    private void addConta(Usuario usuario){
        GerenciadorPerfis.usuarios.add(usuario);
    }
    
    public Usuario procuraConta(String email, String senha){
        for (Usuario usuario : usuarios) {
            if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
                return usuario;
            }
        }return null;
    }

    public void verificaEmail(String email){
        for (Usuario usuario : usuarios) {
            if(usuario.getEmail().equals(email)){
                this.recuperaSenha(email);
            }
        }System.out.println("Email inválido!");
    }

    public void verificaSeContaExiste(String email, String senha){
        for (Usuario usuario : usuarios) {
            if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
                this.apagarConta(email, senha);
            }
        }
    }

    private void recuperaSenha(String email){
        for (Usuario usuario : usuarios) {
            if(usuario.getEmail().equals(email)){
                Scanner s = new Scanner(System.in);
                System.out.println("Informe a nova senha: ");
                usuario.setSenha(s.nextLine());
            }
        }
    }

    public void visitarPerfis(String link, String tag){
        for (Usuario usuario : usuarios) {
            usuario.imprimeDados();
        }
    }

    private void apagarConta(String email, String senha){
        for (Usuario usuario : usuarios) {
            if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha));
            usuarios.remove(usuario);
        }
    }
        
}
