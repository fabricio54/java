
public class OrderRejecter implements ShoppingOrderState{
    private String name = "OrderRejecter";
    private ShoppingOrder order;

    public OrderRejecter (ShoppingOrder order){
        this.order = order;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void approvePayment() {
        System.out.println("Não posso aprovar o pagamento porque o pedido foi recusado.");
        
    }

    @Override
    public void rejectPayment() {
        System.out.println("Não posso recusar o pedido porque o pedido ja esta recusado.");
        
    }

    @Override
    public void waitPayment() {
        System.out.println("Não posso mover para pendente porque o pedido foi recusado.");
        
    }

    @Override
    public void shipOrder() {
        System.out.println("Não posso enviar um pedido com pagamento recusado.");
    }

}
