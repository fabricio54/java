package main;

import java.util.Scanner;

import gerenciadores.GerenciadorPerfis;
import usuario.Usuario;

public class Menu {
    EstadosDoMain estado = new Login(this);

    public void setMudarEstado(EstadosDoMain estado){
        this.estado = estado;
    }

    public void logar(){
        this.estado.logar();
    }

    public void cadastrarUsuario(){
        this.estado.cadastrarUsuario();
    }

    public void estadoNome(){
        this.estado.estadoNome();
    }

    public void login(){
        this.estado.login();
    }

    public void cadastrar(){
        this.estado.cadastrar();
    }

    public void recuperaSenha(){
        this.estado.recuperaSenha();
    }

    public void recuperarSenha(){
        this.estado.recuperarSenha();
    }

    public void apagarConta(){
        this.estado.apagarConta();
    }

    public Usuario getUsuario(){
        return this.estado.getUsuario();
    }
}
