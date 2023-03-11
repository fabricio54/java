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

        // localização
        int posicao = s3.indexOf("Virtual");
        s3.lastIndexOf(texto); // retorna a ultima ocorrência
        System.out.println(posicao);

        //comparação de strings
        String xti = "XTI";
        //boolean x = xti.equalsIgnoreCase("xti"); // iganorando se esta maiuscula ou em minuscula
        boolean x = xti.startsWith("TI"); // verifica a primeira letra e igual a primeira letra que se compara

        int c = "amor".compareTo("bola"); // ele compara que vem antes pela primeira letra 

        String so = "Olhe, olhe";
        boolean o = so.regionMatches( 6, "Olhe", 0, 4); // pesquisa mais específica onde informamos da onde começamos, e que procuramos, de indice começamos apartir da posição que ele começa a farrer e o tamanho da string. caso queira utilizar o método com o case sem sentid adicionamos o parâmetro truu

        String l = "O Brasil é lindo";
        String sl = l.substring(11); // extração de dados: informamos uma posição que onde pegaremos toda a string a partir dessa posição ignorando o restante 
        sl = l.substring(2, 8); // intervalo onde ele pegará a string

        // modificação de strings
        sl = l.concat(" que Maravilha"); // concatena uma string a outra

        s1




        System.out.println(c);
    }
}
