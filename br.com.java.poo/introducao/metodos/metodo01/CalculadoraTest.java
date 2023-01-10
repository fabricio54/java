public class CalculadoraTest {
    public static void main(String[] args){

        /*Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiDoisNumeros(3, 4);

        System.out.println(calculadora.divideDoisNumeros(14, 0));

        calculadora.dividiDoisNumeros(26, 3);*/
        
        // No exemplo a seguir passamos dois numeros do tipo inteiro a um método. Ao fazermos isso estamos passando uma cópia dos valores e não passando o endereço de memória onde eles estão armazenados. portanto não sofrerá alterações dentro do progama principal.
        /*System.out.println("----------------");
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do Main");
        System.out.println(num1);
        System.out.println(num2);*/

        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 3, 6, 7, 9, 19};

        int soma = calculadora.somaArray(numeros);
        System.out.println(soma);

        System.out.println("-------------");

        // mudança na chamada do método
        System.out.println(calculadora.somaVarArgs(2, 3, 5, 9, 10, 12));
    }
}
