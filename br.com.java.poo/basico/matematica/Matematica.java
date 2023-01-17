
public class Matematica {
    
    int maior(int um, int dois){
        if(um > dois){
            return um;
        }return dois;
    }

    int soma(int v1, int v2){
        return v1 + v2;
    }

    /* metodo que recebe um número indefinido de argumentos e retorna a soma de todos eles. também usaremos o conceito de sobrecarga de métodos, se por acaso você passar argumentos de outros tipos, temos que passar primeiro e sempre deixar os que recebem mais valores para o final*/

    int soma(int ... numeros){
        int soma = 0;
        for (int i : numeros) {
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
}
