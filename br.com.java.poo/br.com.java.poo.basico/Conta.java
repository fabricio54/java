public class Conta {

    String cliente;
    double saldo;

    void exibeSaldo() {
        System.out.println(this.cliente +" seu saldo é "+this.saldo);
    }

    void saca(double valor){
        this.saldo -= valor;
    }

    void deposita(double valor){
        this.saldo += valor;
    }

    void transferi(Conta conta, double valor){
        conta.deposita(valor);
    }
}
