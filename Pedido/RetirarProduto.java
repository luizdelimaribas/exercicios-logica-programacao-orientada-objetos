import java.util.List;

public class RetirarProduto implements PedidoStrategy{
 @Override
 public void pedido(Pedido pedido, List<Pedido> carrinho){

   double valorTotal = 0;

    carrinho.remove(pedido);
   
     System.out.println("Removeu " + pedido.getProduto().getNome() + " valor R$" 
    + pedido.getProduto().getValor() + " do pedido numero: " + pedido.getNumeroPedido());

     for(Pedido valor : carrinho){
      valorTotal += valor.getProduto().getValor();
     }

    System.out.println("O valor total R$" + valorTotal);

    System.out.println("--------------------------------------------");
 }
}
