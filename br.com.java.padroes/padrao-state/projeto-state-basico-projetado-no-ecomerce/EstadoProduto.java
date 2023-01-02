public class EstadoProduto implements EstadoCompraProduto {

    public EstadoCompraProduto pedido = new PedidoPendente(this);
    
    public EstadoCompraProduto getStatus(){
        return this.pedido;
    }

    public void setStatus(EstadoCompraProduto pedido){
        this.pedido = pedido;
        System.out.println("O estado atual é "+getStatus());
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return pedido.getNome();
    }

    @Override
    public void pedidoAprovado() {
        this.pedido.pedidoAprovado();
    }

    @Override
    public void pedidoRejeitado() {
        this.pedido.pedidoRejeitado();
        
    }

    @Override
    public void pedidoPendente() {
        System.out.println("Pedido está no estado pendente");
    }

    @Override
    public void entregaPedido() {
        System.out.println("Não pode passar para a entrega pois o pagamento ainda não foi aprovado");
    }

    

}
