package Frete;

public class AtivarFrete {
public static void main(String[] args){


 ProcessarFrete processarFrete = new ProcessarFrete();

 processarFrete.setFreteStrategy(new Correios());
 processarFrete.calcular(20,5,0);

 processarFrete.setFreteStrategy(new FedEx());
 processarFrete.calcular(20, 5, 5);


}
}
