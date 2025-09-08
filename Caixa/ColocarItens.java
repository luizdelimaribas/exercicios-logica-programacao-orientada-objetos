package Caixa;

import java.util.List;

public class ColocarItens implements CaixaStrategy{
@Override
 public void caixa(List<String> listaItens, String item){
    listaItens.add(item);

 }
}