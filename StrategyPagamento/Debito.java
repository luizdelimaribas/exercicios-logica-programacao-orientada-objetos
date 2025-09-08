package StrategyPagamento;

public class Debito implements PagamentoStrategy{
@Override
 public void pagar(double valor){
    System.out.println("O valor de " + valor + "R$ sera pago no debito.");
 }
}
