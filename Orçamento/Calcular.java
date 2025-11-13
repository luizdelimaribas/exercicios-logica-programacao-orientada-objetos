package Orçamento;

import java.util.List;
import java.util.stream.Collectors;


public class Calcular implements StrategyOrcamento{
@Override
 public void calcularDividas(List<Divida> dividas, double orcamento){

    String nomeDivida = dividas.stream()
    .map(Divida :: getNome)
    .collect(Collectors.joining(" , "));

    double somaDividas = dividas.stream()
    .mapToDouble(Divida :: getValor)
    .sum();

    System.out.println("A soma das dividas (" + nomeDivida + ") e de R$" + somaDividas);

    double calculoOrcamentario = orcamento - somaDividas;

    if (calculoOrcamentario < 0) {
        System.out.println("Orçamento ultrapassado!");
    }
    else{
        System.out.println("Dividas de acordo com o orçamento.");
    }

 }
}
