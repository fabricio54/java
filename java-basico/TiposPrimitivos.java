package OrientacaoObjetos.Introducao;

public class TiposPrimitivos {
    
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int idade = 10000000; // variável do tipo inteiro
        double salarioDouble = 10;
        float salarioFloat = 500000000;
        byte idadeByte = -10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000000000;
        char caractere = 'M';
        String nome = "texto grande";

        idade = (int ) numeroGrande; // castle do valor onde asumimos que perderemos valor para adequar os valores

        System.out.println("A idade é "+idade+" anos");
        System.out.println(idade);
    }
}
