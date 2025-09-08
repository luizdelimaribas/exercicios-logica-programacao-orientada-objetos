package Carrinho;

import java.util.List;

public class MostrarCarrinho implements CarrinhoStrategy{
@Override
 public void usoCarrinho(List<Produto> lista, String nome, double valor){
    
    double somaValor = 0;

    for(Produto produto : lista){
        System.out.println(produto.getNome());
        somaValor += produto.getValor();
    }
    
    System.out.println("Valor total:" + somaValor);
    System.out.println("-----------------------------------------------------");
 }
}
