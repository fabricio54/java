public class OperadoresAtribuicao {
    public static void main(String[] args){
        // operadores de atribuição ==, -=, +=, *=, /=, %=
        int salario = 1800;
        salario *= 0.1; // salario = salario * 0.1
        salario += 100; // salario = salario + 100
        salario -= 20;  // salario = salario - 100
        salario /= 100;  // salario = salario / 100
        salario %= 10; // salario = salario % 10; (resto da divisão por 10)


        System.out.println(salario);
    }
}
