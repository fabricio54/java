public class Arrays{
    
    public static void main(String[] args){
        // Quando trabalhamos com vários valores ao mesmo tempo temos que trabalhar com arrays

        // sintaxe para criar um array no java
        // tipoprimitivo (byte, int, long, float, double, char, boolean, String ) [tamanho] (parenteses) NomeVariavel = new tipoprimitivo[tamanho]
        int[] idades = new int[3];

        // atribuição de valores a posições no array
        idades[0] = 3;
        idades[1] = 1;
        idades[2] = 5;

        System.out.println(idades[0]+" "+idades[1]+" "+idades[2]);

        for (int i = 0; i <idades.length; i++){
            System.out.println(idades[i]);
        }

        // foreach
        
        for(int num: idades){
            System.out.println(num);
        }

        // arrays multidimensionais
        // exemplo:
        // 1,2,3,4,5 Meses
        // 31,28,31,30 dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 30;
        dias[0][2] = 29;

        dias[1][0] = 28;
        dias[1][1] = 30;
        dias[1][2] = 28;

        for(int i = 0; i < dias.length; i++){
            for(int j = 0; j < dias[i].length; j++){
                System.out.print(dias[i][j]+" ");
            }System.out.println();
        }

        // foreach arrays multidimencionais
        for(int[] indice: dias){
            for(int num: indice){
                System.out.print(num);
            }System.out.println();
        }

        // inicialização de arrays multidimencionais
        int[][] arrayInt = new int[3][];
        
        arrayInt[0] = new int[]{1, 3};
        arrayInt[1] = new int[]{1, 4, 5, 2, 5};
        arrayInt[2] = new int[]{2, 2, 1, 5, 6, 3, 2, 7};



        for(int[] indice: arrayInt){
            System.out.println("\n----");
            for(int array: indice){
                System.out.println(array+" ");
            }
        }


    }
}