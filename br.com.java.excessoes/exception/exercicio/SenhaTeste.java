public class SenhaTeste {
    // lançado em tempo de execução
    static void autenticar(String senha) throws SenhaInvalidaExcetpion{
        if("123".equals(senha)) {
            // autenticado
            System.out.println("Autenticado");
        } else {
            // senha é incorreta
            throw new SenhaInvalidaExcetpion("Senha Incorreta");
        }
    }
    public static void main(String[] args) {
        try {
            // chamando o método de verificação
            autenticar("123a");
        }catch (SenhaInvalidaExcetpion e){
            // pilha de erros
            e.printStackTrace();
            // lançando a mensagem 
            System.out.println(e.getMessage());
        }
    }
}
