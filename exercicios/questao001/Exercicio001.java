package exercicios;

/*
 * Prática
 * 
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * 
 * Eu <nome>, morando no endereço <endereço> confirmo que recebi o salário de <salario>, na data <data>
 */

public class Exercicio001 {
    public static void main(String[] args){
        String nome = "Babalu";
        String endereco = "Candido de Aguiar - PB";
        double salario = 2345.23;
        String dataRecebimentoSalario = "09/02/2022";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+" confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario);
    }
}
