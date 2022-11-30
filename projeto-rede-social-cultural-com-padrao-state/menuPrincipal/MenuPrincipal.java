package menuPrincipal;

import main.Menu;

public class MenuPrincipal {
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.cadastrar();
        menu.cadastrarUsuario();
        menu.cadastrarUsuario();
        menu.login();
        menu.logar();
        menu.getUsuario().imprimeDados();
    }
}
