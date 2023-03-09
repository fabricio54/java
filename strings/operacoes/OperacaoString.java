package strings.operacoes;

public class OperacaoString {
    public static void main(String[] args) {
        String s1 = "write once";
        String s2 = s1 + " Run AnyWhere";
        String s3 = new String("Java Virtual Machine");
        char[] array = {'J', 'a', 'v', 'a'};
        String s4 = new String(array);

        // Operações
        int tamanho = s1.length(); // retorna o tamanho da string
        char letra = s1.charAt(0); // 0 a length() - 1
        String texto = s1.toString();

        System.out.println(texto);
    }
}
