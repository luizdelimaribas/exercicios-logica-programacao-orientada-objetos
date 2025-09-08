package StrategyPagamento;

public class AtivarStrategyPagamento {
 public static void main(String[] args){
  Processar processar = new Processar();

  processar.setPagamentoStrategy(new Credito());
 
 processar.valor(50.60);

 processar.setPagamentoStrategy(new Debito());

 processar.valor(9.50);

 processar.setPagamentoStrategy(new Pix());

 processar.valor(159.99);
 }
}
