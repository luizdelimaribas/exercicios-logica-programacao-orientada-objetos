import java.util.List;

public class AdicionarProduto implements PedidoStrategy{
 @Override
 public void pedido(Pedido pedido, List<Pedido> carrinho){

   double valorTotal = 0;
   carrinho.add(pedido);
   
    System.out.println(pedido.getCliente().getNome());

    System.out.println("Adicionou " + pedido.getProduto().getNome() + " valor R$" 
    + pedido.getProduto().getValor());

    for(Pedido adicionar : carrinho){
           valorTotal += adicionar.getProduto().getValor();

    }
   

     System.out.println("O valor total: " + valorTotal);
 
 }
}
