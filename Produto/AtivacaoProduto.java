package Produto;
import java.util.Scanner;

public class AtivacaoProduto {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

 System.out.println("Qual o produto: ");
 String NomeProduto = sc.nextLine();

 System.out.println("Quantos tem no estoque: ");
 int QuantidadeProduto = sc.nextInt();

 System.out.println("Qual o preço do produto: ");
 float PrecoProduto = sc.nextFloat();

 Produto produto = new Produto(NomeProduto, QuantidadeProduto, PrecoProduto);

 

 
 produto.exibirProdutos();
 produto.calcularEstoque();
 
 sc.close();
    }
    
}
