public class Main {
    public static void main(String[] args){

        ShoppingOrder order = new ShoppingOrder(); // pendente
        order.approvePayment(); // aprovado
        //order.shipOrder(); // enviando pedido ao cliente
        order.waitPayment(); // pendente
        order.shipOrder();
        order.rejectPayment(); // daqui não altera mais o estado
        order.approvePayment(); // n
        order.waitPayment(); // n
        order.approvePayment(); // n
        order.shipOrder(); // n
    }
}
