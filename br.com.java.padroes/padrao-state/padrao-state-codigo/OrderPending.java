
public class OrderPending implements ShoppingOrderState{

    private String name = "OrderPending";
    private ShoppingOrder order;

    public OrderPending (ShoppingOrder order){
        this.order = order;
    }

    public String getName(){
        return this.name;
    }

    public void approvePayment(){
        this.order.setState(new OrderApproved(this.order));
    }

    public void rejectPayment(){
        this.order.setState(new OrderRejecter(this.order));
    }

    // como ele ja se encontra no estado pagamento pendente e não mudamos de estado lançamos essa mensagem e continuamos no mesmo estado
    public void waitPayment(){
        System.out.println("O pedido ja está no estado pagamento pendente.");
    }

    public void shipOrder(){
        System.out.println("Não posso enviar o pedido com o pagamento pendente");
    }

}
