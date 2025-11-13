import java.util.List;

public class ConcluirPedido implements PedidoStrategy{
 @Override
  public void pedido(Pedido pedido, List<Pedido> carrinho){

    double valorTotal = 0;

 for(Pedido cada : carrinho){
  valorTotal += cada.getProduto().getValor();
 }

 System.out.println("Senhora/senhor " + pedido.getCliente().getNome());
 System.out.println("Seu pedido numero:" + pedido.getNumeroPedido() + " foi concluido!");
 System.out.println("O valor total e de R$" + valorTotal);

  }
}
