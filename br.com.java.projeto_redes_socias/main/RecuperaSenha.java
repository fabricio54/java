package main;

import java.util.Scanner;

import gerenciadores.GerenciadorPerfis;
import usuario.Usuario;

public class RecuperaSenha implements EstadosDoMain{

    private Menu estado;
    private String estadoNome = "Recupera-senha";

    public RecuperaSenha(Menu pagina){
        this.estado = pagina;
    }

    public void cadastrarUsuario(){
        System.out.println("Não existe essa opção");
    }

    public void recuperarSenha(){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o Email válido: ");
        new GerenciadorPerfis().verificaEmail(s.nextLine());
    }

    public void estadoNome(){
        System.out.println(estadoNome);
    }

    @Override
    public void login() {
        this.estado.setMudarEstado(new Login(this.estado));
    }

    @Override
    public void cadastrar() {
        this.estado.setMudarEstado(new Cadastrar(this.estado));
    }

    @Override
    public void recuperaSenha() {
        System.out.println("Já se encontra no estado recupera-senha");
    }

    @Override
    public void logar() {
        System.out.println("Não tem a opção logar em recuperar senha");
    }

    @Override
    public void apagarConta() {
        System.out.println("Não tem a opção apagar conta em recuperar senha");
    }

    @Override
    public Usuario getUsuario(){
        return null;
    }
    
}
