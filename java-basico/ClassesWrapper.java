public class ClassesWrapper {
    public static void main(String[] args){
        /* Wrappers Primitivas

         * Integer Byte Short
         * Long Float Double
         * Character void Boolean
         
        */

        Double preco = new Double("12.45");
        double d = preco.doubleValue();
        int i = preco.intValue();
        byte b = preco.byteValue();
        Boolean casada = new Boolean("true");

        // conversão estática
        double d1 = Double.parseDouble("123.45");
        int i1 = Integer.parseInt("123");
        float f1 = Float.parseFloat("3.14F");
        
        // conversão binária
        int i2 = Integer.valueOf("101011", 2);

        System.out.println(i2);

    }
}
