package CalculadoraDesconto;

public class Processar {
private DescontoStrategy descontoStrategy;

public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
    this.descontoStrategy = descontoStrategy;
}

public void calcular(double valor, double desconto, double descontoFixo){
    descontoStrategy.calcular(valor, desconto, descontoFixo);
}
}
