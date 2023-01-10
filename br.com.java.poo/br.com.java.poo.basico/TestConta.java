public class TestConta {
    public static void main(String[] args){

        Conta conta = new Conta();
        Conta conta2 = new Conta();

        conta.cliente = "Lira";
        conta.saldo = 3432.42;

        conta.exibeSaldo();

        conta.saca(200);

        conta.exibeSaldo();

        conta.deposita(3000);
        conta.deposita(2400);

        conta.exibeSaldo();

        conta2.cliente = "Leo";
        conta2.saldo = 234.80;

        conta.transferi(conta2, 2000);

        conta2.exibeSaldo();
    }
}
