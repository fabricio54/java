package main;

import gerenciadores.GerenciadorPerfis;
import usuario.Usuario;

public class Cadastrar implements EstadosDoMain{
    
    private Menu estado;
    private String estadoNome;

    public Cadastrar(Menu estado){
        this.estado = estado;
    }

    public void cadastrarUsuario(){
        new GerenciadorPerfis().criaConta();
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
        System.out.println("Ja encontra-se em cadastro");
    }

    @Override
    public void recuperaSenha() {
        this.estado.setMudarEstado(new RecuperaSenha(this.estado));
    }

    @Override
    public void logar() {
        System.out.println("Não tem a opção logar em cadastro");
    }

    @Override
    public void apagarConta() {
        System.out.println("Não tem a opção apagar conta em cadastro ");
    }

    @Override
    public void recuperarSenha() {
        System.out.println("Não tem a opção recuperar senha em cadastro");
    }

    @Override
    public Usuario getUsuario(){
        return null;
    }
    
}
