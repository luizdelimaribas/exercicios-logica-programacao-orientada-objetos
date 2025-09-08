package Carrinho;

import java.util.List;

public class ColocarItens implements CarrinhoStrategy{
@Override
 public void usoCarrinho(List<Produto> lista, String nome, double valor){
    lista.add(new Produto(nome, valor));  
 }
}
