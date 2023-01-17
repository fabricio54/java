package variaveisEstaticas;

public class GalinhaTest {
    public static void main(String[] args){
       Galinha g1 = new Galinha();
       Galinha g2 = new Galinha();
       
       /* ao fazermos isso a instância sempre retorna e assim chamamos na mesma linha */
       g1.botar().botar().botar();
       g2.botar().botar().botar();

       System.out.println("Galinha g1: "+g1.ovos);
       System.out.println("Galinha g2: "+g2.ovos);

       /* acessamos o valor da variável estatica com a galinha */
       System.out.println("Ovos da granja: "+Galinha.totalOvosDaGranja);

       /* Acessando a media de ovos dessa granja atraves de um método global */ 
       System.out.println("Média de ovos da granja: "+Galinha.media(2));
    }
}
