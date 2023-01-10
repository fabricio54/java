public class Calculadora{
    
    // Métodos criados que não retornam nada OBS: Não confundir retorno de método com saída
    // por exemplo: nos métodos criados abaixo, eles não retornam nada mais tem uma saída que no caso em específico e um print

    // Métodos que não recebem parâmetros
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(12 - 2);
    }

    // Métodos sem retorno e com parâmetros
    public void multiDoisNumeros(int num, int num2){
        // validando Método

        System.out.println(num*num2);
    }

    // Métodos com retorno 
    public double divideDoisNumeros(double num1, double num2){
        // validando método de retorno
        if (num2 == 0){
            return 0;
        }
        return (num1 / num2);
    }

    public void dividiDoisNumeros(int num, int num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println((double)(num/num2));
    }
    
    // basicamente os valores recebidos no método são copias e não a referência do endereço de memória onde estão os valores
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 100;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }

    public int somaArray(int[] numeros){
        int soma = 0;
        // opção de foreach
        /*for (int i : numeros) {
            soma += i;
        }*/
        for(int i=0;i < numeros.length; i++){
            soma += numeros[i];
        }
        return soma;
    }
    
    // método mais recente onde muda na chamada do método onde ao inves de passar um vetor passamos uma sequência de números
    public int somaVarArgs(int... numeros){
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        return soma;
    }

}