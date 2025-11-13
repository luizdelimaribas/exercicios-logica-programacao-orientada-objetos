import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AtivarPedido {
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 List<Produto> listaProdutos = new ArrayList<>();
 List<Pedido> carrinho = new ArrayList<>();
 

 boolean lop = true;
 int escolha;

 Produto produto = new Produto("Laranja", 5.50);
 listaProdutos.add(produto);
 
 Produto produto2 = new Produto("Energetico", 20.99);
 listaProdutos.add(produto2);

 Produto produto3 = new Produto("Votica", 55);
 listaProdutos.add(produto3);

 
    System.out.println("Nome do cliente:");
String nomeCliente = sc.nextLine();

System.out.println("Telefone do cliente:");
int telefoneCliente = sc.nextInt();

 Cliente cliente = new Cliente(nomeCliente, telefoneCliente);

 

 while (lop) {
 System.out.println("1 para adicionar produto, 2 para retirar ");
 System.out.println(" 3 concluir o pedido e 4 para cancelar pedido ou 5 para encerra"); 

    try{escolha = sc.nextInt();
       sc.nextLine();
    }
    catch(InputMismatchException e ){
             System.out.println("Opção errada!");
           sc.nextLine();
           continue;
    }

    System.out.println("-----------------------------------------------------");

 switch (escolha) {
    case 1:
    for( Produto iten : listaProdutos){
            System.out.println(iten.getNome() + " valor R$ " + iten.getValor());

    }
     
     System.out.println("Digite 1 para o primeiro, 2 para segundo e 3 para terceiro");
     int escolhido = sc.nextInt();

    Produto produtoEscolhido = listaProdutos.get(escolhido - 1);

    Pedido pedido = new Pedido(produtoEscolhido, cliente, 1289);

    ProcessarPedido processarPedido = new ProcessarPedido(new AdicionarProduto());
    processarPedido.aplicarPedido(pedido, carrinho);
    
    System.out.println("-----------------------------------------");
        break;
    case 2:
        for(Pedido iten : carrinho){
            System.out.println(iten.getProduto().getNome() + " valor R$" + iten.getProduto().getValor());
        }
        System.out.println("Digite 1 para o primeiro, 2 para segundo , 3 para terceiro e assim adiante " );
         int escolhidoRemover = sc.nextInt();
        
         Pedido pedidoRemover = carrinho.get(escolhidoRemover - 1);

         processarPedido = new ProcessarPedido(new RetirarProduto());
         processarPedido.aplicarPedido(pedidoRemover, carrinho);
        break;
    case 3:
        pedido = new Pedido(produto, cliente, 1289);
        processarPedido = new ProcessarPedido(new ConcluirPedido());
        processarPedido.aplicarPedido(pedido, carrinho);
        lop = false;
        break;
    case 4:
        pedido = new Pedido(produto, cliente, 1289);
        processarPedido = new ProcessarPedido(new CancelarPedido());
        processarPedido.aplicarPedido(pedido, carrinho);
        break;
    case 5:
        lop = false;
        break;    

    default:
        break;
 }


 }


 sc.close();
}
}
