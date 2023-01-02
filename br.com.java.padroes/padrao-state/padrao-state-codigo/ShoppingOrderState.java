
public interface ShoppingOrderState {
    // criando uma interface que vai compor as classes estados com cada uma tendo suas peculiaridades
    public String getName();
    public void approvePayment();
    public void rejectPayment();
    public void waitPayment();
    public void shipOrder();
    
}
