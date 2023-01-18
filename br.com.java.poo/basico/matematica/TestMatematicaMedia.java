public class TestMatematicaMedia {
    public static void main(String[] args){
        Matematica media = new Matematica();
        
        /* exemplo feito com números do tipo double/int */
        System.out.println(media.media(2, 4));

        /* exemplo feito com String que posteriormente dentro do método será convertido em double e retornará o valor em double */
        System.out.println(media.media("5", "3"));
    }
}
