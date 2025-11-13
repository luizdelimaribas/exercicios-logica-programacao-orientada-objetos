import java.util.List;

public class ProcessarPedido {
 private PedidoStrategy pedidoStrategy;

 public ProcessarPedido(PedidoStrategy pedidoStrategy) {
    this.pedidoStrategy = pedidoStrategy;
 }

 public void setPedidoStrategy(PedidoStrategy pedidoStrategy) {
    this.pedidoStrategy = pedidoStrategy;
 }


  public void aplicarPedido(Pedido pedido, List<Pedido> carrinho){
    pedidoStrategy.pedido(pedido, carrinho);
  }
}
