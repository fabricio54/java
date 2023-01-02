
public class PedidoRejeitado implements EstadoCompraProduto{
    private String nome = "Pedido Rejeitado";
    private EstadoProduto pedido;

    public PedidoRejeitado(EstadoProduto pedido){
        this.pedido = pedido;
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return this.nome;
    }

    @Override
    public void pedidoAprovado() {
        System.out.println("Pedido não pode ser aprovado pois ja foi rejeitado"); 
    }

    @Override
    public void pedidoRejeitado() {
        System.out.println("pedido ja está no estado pedido rejeitado");
    }

    @Override
    public void pedidoPendente() {
        System.out.println("pedido ja foi rejeitado e não pode esta pendente");
    }

    @Override
    public void entregaPedido() {
        System.out.println("Não pode ser entregue pois o pedido está rejeitado");
    }


}
