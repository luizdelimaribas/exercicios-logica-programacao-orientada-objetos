package OrdenProduto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Preco implements OrdenacaoStrategy{

  List<Double> precoProduto = new ArrayList<>();

@Override
 public void ordenacao(double preco, String nome, String data){
   
    precoProduto.add(preco);
    Collections.sort(precoProduto, Collections.reverseOrder());
    
  System.out.println(precoProduto);

 }

}
