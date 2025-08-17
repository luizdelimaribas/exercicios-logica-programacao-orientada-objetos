package Pagamento;
public class AtivarPagamento {
    public static void main(String[] args){
 
 Pagamento boleto = new Boleto();

 boleto.processarPagamento();

 Pagamento credito = new Credito();

 credito.processarPagamento();

    }
}
