package CalculadoraDesconto;

public class Percentual implements DescontoStrategy {
    @Override
    public void calcular(double valor, double desconto, double descontoFixo){
      double valorFinal = (valor * desconto /100) + valor;
        System.out.println("O valor da mensalidade: " + valorFinal);
    }

}
