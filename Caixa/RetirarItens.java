package Caixa;

import java.util.List;

public class RetirarItens implements CaixaStrategy{
@Override
 public void caixa(List<String> listaItens, String item){
 listaItens.remove(item);
 }
}
