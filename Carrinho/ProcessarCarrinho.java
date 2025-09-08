package Carrinho;

import java.util.List;

public class ProcessarCarrinho {
 private CarrinhoStrategy carrinhoStrategy;

 public void setCarrinhoStrategy(CarrinhoStrategy carrinhoStrategy) {
    this.carrinhoStrategy = carrinhoStrategy;
 }
 
 public void uso(List<Produto> lista, String nome, double valor){
    carrinhoStrategy.usoCarrinho(lista, nome, valor);
 }
}
