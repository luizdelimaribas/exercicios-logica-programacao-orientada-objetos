import java.util.Scanner;

public class AtivacaoConta {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

  System.out.println("Qual a sua conta: ");
 int numerocontaConta1 = sc.nextInt();

 if (numerocontaConta1 == 663375) {
    int saldoconta1 = 10;
    ContaBancaria conta1 = new ContaBancaria(numerocontaConta1,
  saldoconta1);

  conta1.exibirDadosConta();

 }
 else{
    System.out.println("Conta inexistente, tente novamente.");
 }


  sc.close();
    }
}
