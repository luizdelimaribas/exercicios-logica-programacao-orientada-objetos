package StrategyPagamento;

public class Pix implements PagamentoStrategy{
@Override
 public void pagar(double valor){
    System.out.println("O valor de " + valor + "R$ foi pago no pix.");
 }
}
