package usuario;

import java.util.Scanner;

public class Usuario {

    private String email;
    private String senha;
    private Perfil perfil;

    public Usuario criaUsuario(){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o nome e descreva a bio nessa sequência: ");
        this.perfil = new Perfil(s.nextLine(), s.nextLine());
        
        System.out.println("Informe o Email: ");
        this.email = s.nextLine();

        System.out.println("Informe a Senha: ");
        this.senha = s.nextLine();

        return this.retornaUsuario();
    }

    public void imprimeDados(){
        this.perfil.imprimeDados();
    }

    private Usuario retornaUsuario(){
        return this;
    }

    public String getEmail(){
        return this.email;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public void curtirPublicacao(){
        System.out.println("publicação curtida!!!");
    }

    public void descurtirPublicacao(){
        System.out.println("Publicação descurtida!!!");
    }

    public void visitarPerfil(Usuario usuario){
        usuario.imprimeDados();
    }

    public Perfil getPerfil(){
        return perfil;
    }

    public void alteraTema(){
        System.out.println("Tema alterado!!!");
    }
}
