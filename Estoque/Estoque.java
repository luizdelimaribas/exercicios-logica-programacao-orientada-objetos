
package Estoque;

import java.util.ArrayList;
import java.util.List;



public class Estoque {
    
    private List<Produto> listaProdutos;
    

    public Estoque() {
      
         this.listaProdutos = new ArrayList<>();
    }
  
 public void adicionarProdutos(Produto produto){
    listaProdutos.add(produto);
 }

 public void conteudo(){
    for(Produto itemNoProdutos : listaProdutos){
        System.out.println(itemNoProdutos);
    }
 }
    
}
