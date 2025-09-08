package Caixa;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class AtivarCaixa {
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

  int escolha;
 String item;
 boolean lop = true;
  List<String> listaItens = new ArrayList<>();
 
 ProcessarCaixa processarCaixa = new ProcessarCaixa();

  System.out.println("Você quer retirar ou colocar item na caixa?");
 
 while (lop) {

 System.out.println("1 para colocar, 2 para retirar e 3 mostrar itens da caixa ou 4 para encerra ");
    try{    
     escolha = sc.nextInt();
     sc.nextLine(); //Consumir nova linha deixado por nextInt(), para não da erro.
        }
        catch(InputMismatchException e){
            System.out.println("Opção errada!");
            sc.next();
            continue;
        }
    
    switch (escolha) {
        case 1://colocar intens 
         System.out.println("Qual o iten a colocar:");
         item = sc.nextLine();
         processarCaixa.setCaixaStrategy(new ColocarItens());
         processarCaixa.UsarCaixa(listaItens, item);
            break;
    
        case 2: //retirar itens 
         System.out.println("Qual o iten a retirar:");
         item = sc.nextLine();
         processarCaixa.setCaixaStrategy(new RetirarItens());
         processarCaixa.UsarCaixa(listaItens, item);
         break;

        case 3:
          //mostrar itens da lista=caixa
         processarCaixa.setCaixaStrategy(new ItensCaixa());
         processarCaixa.UsarCaixa(listaItens, null);
         break;
        case 4:
         lop = false;
         break;

        default:
         System.out.println("Opção invalida!");
            break;
    }
 }

 



 sc.close();
}
}
