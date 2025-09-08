package OrdenProduto;

import java.util.Scanner;

public class AtivarOrden {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

 ProcessarOrden processarOrden = new ProcessarOrden();


 System.out.println("1 para nome, 2 para preço");
 int escolha = sc.nextInt();
 if (escolha == 2) {
  processarOrden.setOrdenacaoStrategy(new Preco());  
 }
 else {
    processarOrden.setOrdenacaoStrategy(new Nome());
 }
  

 processarOrden.ordenar(100.50, "Prato", "03/12/2020");

 processarOrden.ordenar(150.50, "Martelo", "03/12/2021");

 processarOrden.ordenar(160.00, "Felipe", "03/12/2021");

 processarOrden.ordenar(135.99, "Armando", "03/12/2021");


 sc.close();
}
}
