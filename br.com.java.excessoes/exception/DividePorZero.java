import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
    public static void main(String[] args){
        
        // lançamento de excessão
        Scanner s = new Scanner(System.in);
        boolean continua = true;

        do {
            try {
                System.out.println("Número: ");
                int a = s.nextInt();
                System.out.println("Divisor: ");
                int d = s.nextInt();
                
                // se retorna um erro a linha de abaixo não será executada
                System.out.println(a/d);
                
                // caso passe a divisão em cima não gere um erro
                continua = false;
                //InputMismatchException tipo
                //AritheticException      0
            }
            catch(InputMismatchException e1){
                System.err.println("Números devem ser inteiros");
                s.nextLine(); //descarta a entrada errada dos números e armazena outros
            }
            catch(ArithmeticException e2){
                //err significa error. imprime na tela a mensagem de uma cor diferente
                System.err.println("Divisor deve ser diferente de zero");
                s.nextLine(); //descarta a entrada errada dos números
            }
            // independente dos trechos de códigos acima sempre será executado esse de baixo
            finally {
                System.out.println("finally executado...");
            }
        } while (continua);

        
    }
}
