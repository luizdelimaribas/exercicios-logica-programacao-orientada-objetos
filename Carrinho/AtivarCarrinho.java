package Carrinho;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AtivarCarrinho {
public static void main(String[] args){

 Scanner sc = new Scanner(System.in);

    int escolha;
    boolean lop = true;
    String nome;
    double valor = 0;
    List<Produto> lista = new ArrayList<>();
    ProcessarCarrinho processarCarrinho = new ProcessarCarrinho();



while (lop) {
     System.out.println("1 para colocar, 2 para retirar e 3 mostrar itens no carrinho ou 4 para encerra ");

 try{ escolha = sc.nextInt();
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
     System.out.println("Nome do produto:");
     nome = sc.nextLine();

     
    System.out.println("Valor do produto:");
     valor = sc.nextDouble();
     
     processarCarrinho.setCarrinhoStrategy(new ColocarItens());
     processarCarrinho.uso(lista, nome, valor);
        break;
        
    case 2:
    System.out.println("Nome do produto para retirar:");    
      nome = sc.nextLine();

      processarCarrinho.setCarrinhoStrategy(new RetirarItens());
      processarCarrinho.uso(lista, nome, valor);
      break;

    case 3:
          //mostrar itens da lista=caixa
          processarCarrinho.setCarrinhoStrategy(new MostrarCarrinho());
          processarCarrinho.uso(lista, nome = null, valor);
          break;

    case 4:
         lop = false;
         break; 

    default:
    System.out.println("Opção invalida!");
        break;
 }
    
}
 


    



 sc.close();
}
}
