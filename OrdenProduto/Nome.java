package OrdenProduto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nome implements OrdenacaoStrategy{
    List<String> listanome = new ArrayList<>();

@Override
 public void ordenacao(double preco, String nome, String data){

  listanome.add(nome);

  Collections.sort(listanome);

  System.out.println(listanome);
 }
}
