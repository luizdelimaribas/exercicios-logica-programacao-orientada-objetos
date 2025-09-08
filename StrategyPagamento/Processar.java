package StrategyPagamento;

public class Processar {
 private PagamentoStrategy pagamentoStrategy;

 public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
    this.pagamentoStrategy = pagamentoStrategy;
 }


 public void valor(double valor){
    pagamentoStrategy.pagar(valor);
 }
}
