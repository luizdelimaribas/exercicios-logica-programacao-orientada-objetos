package CalculadoraDesconto;

public class SemDesconto implements DescontoStrategy{
@Override
public void calcular(double valor, double desconto, double descontoFixo){
    System.out.println("O valor da mensalidade: " + valor);
}
}
