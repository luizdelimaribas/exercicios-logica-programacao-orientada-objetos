package Frete;

public class FedEx implements FreteStrategy {
@Override
 public void frete(int peso, int distância, int servico){
 int valor = servico + distância + (peso / 10);
 System.out.println("O valor do frete no FedEx e de: " + valor + " R$");
 }
}
