public class OrderApproved implements ShoppingOrderState{
    private String name = "OrderApproved";
    private ShoppingOrder order;

    public OrderApproved (ShoppingOrder order){
        this.order = order;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void approvePayment() {
        System.out.println("O pedido ja está no estado Aprovado");
    }

    @Override
    public void rejectPayment() {
        this.order.setState(new OrderRejecter(this.order));
    }

    @Override
    public void waitPayment() {
        this.order.setState(new OrderPending(this.order));
        
    }

    @Override
    public void shipOrder() {
        System.out.println("Enviando o pedido para o cliente...");
    }

}
