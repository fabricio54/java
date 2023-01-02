
public class PedidoPendente implements EstadoCompraProduto{
    private String nome = "Pedido Pendente";
    private EstadoProduto pedido;

    public PedidoPendente(EstadoProduto pedido){
        this.pedido = pedido;
    }

    public String getStatusNome(){
        return this.pedido.getNome();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return this.nome;
    }

    @Override
    public void pedidoAprovado() {
        this.pedido.setStatus(new PedidoAprovado(this.pedido));
    }

    @Override
    public void pedidoRejeitado() {
        this.pedido.setStatus(new PedidoRejeitado(this.pedido));
    }

    @Override
    public void pedidoPendente() {
        System.out.println("Pedido Ja está pendente");
    }

    @Override
    public void entregaPedido() {
        System.out.println("Pedido não pode ser entregue por que está pendente");  
    }

}
