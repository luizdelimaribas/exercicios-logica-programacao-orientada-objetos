import java.util.List;

public interface PedidoStrategy {
 void pedido(Pedido pedido, List<Pedido> carrinho);
}
