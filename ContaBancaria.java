// uma classe ContaBancaria com atributos para saldo e número da conta.
// Adicione métodos para depositar e sacar dinheiro.


public class ContaBancaria {
    private int saldo, numeroconta;

    public ContaBancaria(int conta, int saldo){
        this.numeroconta = conta;
        this.saldo = saldo;
    }

  public int getnumeroconta(){
    return numeroconta;
  }
  
  public void setnumeroconta(int conta){
    this.numeroconta = conta;
  }

  public int getsaldo(){
    return saldo;
  }

  public void setsaldo(int saldo){
    this.saldo = saldo;
  }
    
  public void exibirDadosConta(){
    System.out.println("O numero da conta: " + numeroconta);
    System.out.println("O saldo e de R$: " + saldo);
  }
 

}