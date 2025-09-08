package Caixa;

import java.util.List;

public class ItensCaixa implements CaixaStrategy{
@Override
 public void caixa(List<String> listaItens, String item){
 System.out.println(listaItens);
 }
}
