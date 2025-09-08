package Caixa;

import java.util.List;

public class ProcessarCaixa {
 private CaixaStrategy caixaStrategy;

 public void setCaixaStrategy(CaixaStrategy caixaStrategy) {
    this.caixaStrategy = caixaStrategy;
 }


 public void UsarCaixa(List<String> listaItens, String item){
    caixaStrategy.caixa(listaItens, item);
 }

 
}
