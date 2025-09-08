package Frete;

public class ProcessarFrete {
 private FreteStrategy freteStrategy;

 public void setFreteStrategy(FreteStrategy freteStrategy) {
    this.freteStrategy = freteStrategy;
 }

 public void calcular(int peso, int distância, int servico){
    freteStrategy.frete(peso , distância, servico);
 }
}
