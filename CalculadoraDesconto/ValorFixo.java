package CalculadoraDesconto;

public class ValorFixo implements DescontoStrategy {
@Override
public void calcular(double valor, double desconto, double descontoFixo){
    double valorFinal = (valor * descontoFixo /100) + valor;
    System.out.println("O valor da mensalidade: " + valorFinal);
}
}
