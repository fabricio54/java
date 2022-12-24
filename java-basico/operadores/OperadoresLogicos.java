package operadores;

public class OperadoresLogicos {
    public static void main(String[] args){
        // utilizando operadores lógicos (&& operador e) e (|| operador ou)
        int idade = 18;
        float salario = 1000f;

        // so será verdade se as duas condições forem verdadeiras
        System.out.println(idade >= 10 && salario >= 1000);

        // so será verdade se pelo menos um for verdade
        System.out.println(idade >= 10 || salario >= 2000);
    } 
}
