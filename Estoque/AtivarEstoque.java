package Estoque;

public class AtivarEstoque {
    public static void main(String[] args){

 Produto martelo = new Produto("Martelala", "M8526", 323.99);
 Produto alicate = new Produto("Alicato", "FG5556", 56.99);
 Produto prego = new Produto("PregaPrega", "PP5.3", 10.00); 

 Estoque estoque = new Estoque();

 estoque.adicionarProdutos(alicate);

 estoque.adicionarProdutos(martelo);

 estoque.adicionarProdutos(prego);

 estoque.conteudo();
 
 System.out.println(Produto.getTotalProduto());
 
    }
}
