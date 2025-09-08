package Frete;

public class Correios implements FreteStrategy{
@Override
public void frete(int peso, int distância, int servico){
 int valor = servico + distância + (peso / 10);
 System.out.println("O valor do frete e de: " + valor + " R$");
}
}
