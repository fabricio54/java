package main;

import java.util.Scanner;

import gerenciadores.GerenciadorPerfis;
import usuario.Usuario;

public class Login implements EstadosDoMain{
    private Menu estado;
    private String estadoNome = "Login";
    private Usuario usuario;
    

    public Login(Menu estado){
        this.estado = estado;
    }

    public void estadoNome(){
        System.out.println(estadoNome);
    }

    public void cadastrarUsuario(){
        System.out.println("Não existe essa opção");
    }

    @Override
    public void logar(){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o email e a senha na sequência: ");
        this.usuario = new GerenciadorPerfis().procuraConta(s.nextLine(), s.nextLine());
    }

    public void apagarConta(){
        new GerenciadorPerfis().verificaSeContaExiste(usuario.getEmail(), usuario.getSenha());
        usuario = null;
    }

    @Override
    public void login() {
        System.out.println("Ja encontra-se no Login");
    }

    @Override
    public void cadastrar() {
        this.estado.setMudarEstado(new Cadastrar(this.estado));
    }

    @Override
    public void recuperaSenha() {
        this.estado.setMudarEstado(new RecuperaSenha(this.estado));
    }

    @Override
    public void recuperarSenha() {
        System.out.println("Não tem a opção recuperar senha em login");
    }

    @Override
    public Usuario getUsuario(){
        return usuario;
    }
    
}
