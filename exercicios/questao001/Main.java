package exercicios;

import exercicios.Chevrolet;

public class Main {
    public static void main(String[] args){
        ProjetoCarro car1 = new Fiat();
        ProjetoCarro car2 = new Volkswagen();
        ProjetoCarro car3 = new Chevrolet();
        ProjetoCarro car4 = new Ford();

        car1.modeloCarro("Palio");
        car1.versaoCarro(1.5);
        car1.automaticoCarro(true);

        car2.modeloCarro("Gol");
        car2.versaoCarro(1.0);
        car2.automaticoCarro(false);

        car3.modeloCarro("Celta");
        car3.versaoCarro(1.5);
        car3.automaticoCarro(true);

        car4.modeloCarro("Fiesta");
        car4.versaoCarro(2.0);
        car4.automaticoCarro(false);

        System.out.println("Fabricante car1: "+car1.retornaMontadora());
        System.out.println("Fabricante car2: "+car2.retornaMontadora());
        System.out.println("Fabricante car2: "+car3.retornaMontadora());
        System.out.println("Fabricante car4: "+car4.retornaMontadora());
    }
}
