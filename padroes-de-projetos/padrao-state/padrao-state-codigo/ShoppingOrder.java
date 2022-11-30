public class ShoppingOrder {

    // como estamos passando o contexto ao estado ele tera acesso ao objeto contexto
    ShoppingOrderState state = new OrderPending(this);

    public ShoppingOrderState getState(){
        return this.state;
    }

    public void setState(ShoppingOrderState state){
        this.state = state;
        System.out.println("O estado do pedido é "+this.getStateName());
    }

    public String getStateName(){
        return this.state.getName();
    }

    public void approvePayment(){
        this.state.approvePayment();
    }

    public void rejectPayment(){
        this.state.rejectPayment();
    }

    public void waitPayment(){
        this.state.waitPayment();
    }

    public void shipOrder(){
        this.state.shipOrder();
    }
}
