package Orçamento;

import java.util.List;

public interface StrategyOrcamento {
 void calcularDividas(List<Divida> dividas, double orcamento);
}
