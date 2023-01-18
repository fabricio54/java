
public class Matematica {
    
    int maior(int um, int dois){
        if(um > dois){
            return um;
        }return dois;
    }

    double soma(double v1, double v2){
        return v1 + v2;
    }

    /* metodo que recebe um número indefinido de argumentos e retorna a soma de todos eles. também usaremos o conceito de sobrecarga de métodos, se por acaso você passar argumentos de outros tipos, temos que passar primeiro e sempre deixar os que recebem mais valores para o final*/

    double soma(double ... numeros){
        double soma = 0;
        for (double i : numeros) {
            soma += i;
        }
        return soma;
    }

    int RaizQuadrada(int num){
        int cont = 0;
        for(int i = 1; i <= num; i+=2){
            num = num - i;
            cont++;
        }/*
        (25 - 1) (24 - 3) (21 - 5) (16 - 7) (8 - 9) */
        return cont;
    }

    /* sobrecarga de métodos com assinaturas diferentes: método que calcula e retorna a media entre dois números.
     * se observamos bem eles tem o mesmo nome, returnam o mesmo tipo de valor mais a assinatura e diferente.
    */

    /* método que retorna o próprio número */
    double media(double x){
        return x;
    }
    
    /* método que recebe dois números */
    double media(double x, double y){
        System.out.println("media(double x, double y) ");
        return (x + y) / 2;
    }
    
    /* método que recebe mais de dois números */
    double media(double[] ... numeros){
        int quant = 0;
        for (double[] ds : numeros) {
            quant++;
        }
        return this.soma(numeros) / quant;
    }

    /* método que recebe dois números em strings */
    double media(String x, String y){
        System.out.println("media(String x, String y) ");
        double ix = Double.parseDouble(x);
        double iy = Double.parseDouble(y);
        return (ix + iy) / 2;
    }
    
}
