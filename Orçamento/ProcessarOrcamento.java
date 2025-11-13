package Orçamento;

import java.util.List;

public class ProcessarOrcamento {
 private StrategyOrcamento strategyOrcamento;

 public ProcessarOrcamento(StrategyOrcamento strategyOrcamento) {
    this.strategyOrcamento = strategyOrcamento;
 }

 public void setStrategyOrcamento(StrategyOrcamento strategyOrcamento) {
    this.strategyOrcamento = strategyOrcamento;
 }


 public void processarCalculo(List<Divida> dividas, double orcamento){
    strategyOrcamento.calcularDividas(dividas, orcamento);
 }
 
}
