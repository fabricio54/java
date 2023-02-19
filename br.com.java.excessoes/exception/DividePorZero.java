import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

    public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException{
        System.out.println("Número: ");
        int a = s.nextInt();
        System.out.println("Divisor: ");
        int d = s.nextInt();
                
        // se retorna um erro a linha de abaixo não será executada
        System.out.println(a/d);
    }
    public static void main(String[] args){
        
        // lançamento de excessão
        Scanner s = new Scanner(System.in);
        boolean continua = true;

        do {
            try {
                dividir(s);
                // caso passe a divisão em cima não gere um erro
                continua = false;
                //InputMismatchException tipo
                //AritheticException      0
            }
            // como o problema é o mesmo, resolvemos em um único catch
            catch(InputMismatchException  | ArithmeticException e1){
                System.err.println("Número Inválido ");
                e1.printStackTrace();
                // retorna uma pilha dos erros que foram identificados e1.getStackTrace();
                // retorna uma pilha de erros em string e1.getMessage();
                s.nextLine(); //descarta a entrada errada dos números e armazena outros
            }
            // independente dos trechos de códigos acima sempre será executado esse de baixo
            finally {
                System.out.println("finally executado...");
            }
        } while (continua);

        
    }
}
