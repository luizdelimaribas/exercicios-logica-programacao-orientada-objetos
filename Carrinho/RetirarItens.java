package Carrinho;

import java.util.List;

public class RetirarItens implements CarrinhoStrategy{
@Override
 public void usoCarrinho(List<Produto> lista, String nome, double valor){
    String retirarIten = nome;
  lista.removeIf(Produto -> Produto.getNome().equals(retirarIten));
 }
}
