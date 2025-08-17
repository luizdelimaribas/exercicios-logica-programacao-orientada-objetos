package Pagamento;
public class Credito implements Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento feito por credito");
       
    }
    
}
