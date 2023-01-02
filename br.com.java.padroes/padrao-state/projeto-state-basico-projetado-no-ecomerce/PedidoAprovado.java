public class PedidoAprovado implements EstadoCompraProduto{
    private String nome = "Pedido Aprovado";
    private EstadoProduto pedido;

    public PedidoAprovado(EstadoProduto pedido){
        this.pedido = pedido;
    }

    public String getStatusNome(){
        return this.getNome();
    }


    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return this.nome;
    }

    @Override
    public void pedidoAprovado() {
       System.out.println("Pedido ja está no estado aprovado");
    }

    @Override
    public void pedidoRejeitado() {
       this.pedido.setStatus(new PedidoRejeitado(this.pedido));
    }

    @Override
    public void pedidoPendente() {
        this.pedido.setStatus(new PedidoPendente(this.pedido));
    }

    @Override
    public void entregaPedido() {
        System.out.println("Pedido não pode ser entregue por que ja foi rejeitado");
    }

    
}
