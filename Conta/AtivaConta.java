package Conta;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AtivaConta {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
   
       Integer numeroConta;
       int escolhaAtendimento = 0;
        boolean continuar = true;

         

     System.out.println("Qual o numero da conta:");
     numeroConta = sc.nextInt();

      Conta conta = new Conta(0.0, numeroConta);
     
        if (numeroConta != 663375) {
        System.out.println("Conta errada!");
        
        }

      

      else{

        System.out.println("Qual opção você escolhe: ");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Sacar");
        System.err.println("3 - depositar");
        System.err.println("4 - Encerrar");

       
     
     while ( continuar) {

     
        try{
             escolhaAtendimento = sc.nextInt();
        }

       catch(InputMismatchException e ){
          System.out.println("Entrada inválida! Por favor, um golpe valido.");
          sc.next();
          continue;
       }

       switch (escolhaAtendimento) {
        case 1:
            conta.saldo();
            break;
        case 2:
            System.out.println("Qual o valor quer sacar :");
            double saque = sc.nextInt();
            conta.sacar(saque);
            break;
        case 3:
            System.out.println("Qual o valor quer depositar :");
            double deposito = sc.nextInt();
            conta.depositar(deposito);
            break;
        case 4:
             continuar = false;
              System.out.println("Operação encerrada!");
            break;
       
        default:
         System.out.println("Opção inválida, tente novamente.");
            continue;
       }

        
      }
     
     }
     

        sc.close();
    }
}
