package Tv;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AtivacaoTv {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

 boolean continuar = true;
 int escolha;

 System.out.println("Qual marca da tv vc quer?");
 String marca = sc.nextLine();


 System.out.println("Qual tamanho da tv vc quer?");
 int tamanho = sc.nextInt();

 

 Tv tv = new Tv(marca, tamanho);

 tv.especificacaoTv();

 System.out.println("Para aumentar digite 1, 2 para diminuir o volume ou 3 para encerrar.");
  

while (continuar) {
    try{escolha = sc.nextInt();}

    catch(InputMismatchException e){
  System.out.println("Entrada inválida! Por favor, um golpe valido.");
  sc.next();
  continue;
    }
     
 switch (escolha) {
    case 1:
      tv.aumentaVolume();
        break;
    case 2:
        tv.diminuirVolume();
        break;
    case 3:
      continuar = false;
      break;    
 
    default:
    System.out.println("Opção invalida!");
        break;
 }

 }
 

 sc.close();
    }
}
