import java.util.List;

public class CancelarPedido implements PedidoStrategy{
 @Override
 public void pedido(Pedido pedido, List<Pedido> carrinho){

    carrinho.removeAll(carrinho);

    System.out.println("Seu pedido numero: " + pedido.getNumeroPedido() + " , foi cancelado");

    System.out.println("------------------------------------------");
 }
}
