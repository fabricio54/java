package exercicios.questao2;

public class Main {
    public static void main(String[] args){
        Coqueteis coquetel = new Coqueteis();
        coquetel.bebidaPura("Conhaque");
        coquetel.adicionalElemento("Gelo");
        coquetel.adicionalElemento("açucar");
        coquetel.adicionalElemento("Limão");

        coquetel.apresentaCoquetel();
    }
}
