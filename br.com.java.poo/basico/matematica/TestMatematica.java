
public class TestMatematica {
    public static void main(String[] args){
        Matematica matematica = new Matematica();

        /*System.out.println(matematica.maior(2, 3));
        System.out.println(matematica.soma(2, 4));*/
        
        /* usando dois conceitos sobrecarga de métodos e passando valores indefinidos de números no parâmetro */
        System.out.println(matematica.soma(2, 3, 3, 5, 1));
    }
}
