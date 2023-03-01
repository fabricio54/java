public class Debug {

    public int raiz(numero){
        int cont = 0;
        for(int i = 1; i <= numero; i+=2){
            num = numero - i;
            cont++;
        }/*
        (25 - 1) (24 - 3) (21 - 5) (16 - 7) (8 - 9) */
        return cont;
    }
    public static void main(String[] args) {
        // debug                 debub avançado
        // Breakpoints           Breakpoint properti
        // Variables             Watchpoint
        // Expressions           Exception Breakpoint
        // Navegação             Class Breakpoint
        // F5, F6, F7, F8 
        
        int numero = 16;
        Debug exemplo = new Debug();
        int raiz = exemplo.raiz(numero);
    }
}
