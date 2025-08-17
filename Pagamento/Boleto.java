package Pagamento;
public class Boleto implements Pagamento {
  
 @Override
    public void processarPagamento() {
        System.out.println("Pagamento feito por boleto");
      
    }

}
