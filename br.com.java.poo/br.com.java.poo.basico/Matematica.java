public class Matematica {
    
    int maior(int um, int dois){
        if(um > dois){
            return um;
        }return dois;
    }

    int soma(int v1, int v2){
        return v1 + v2;
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
