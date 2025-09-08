package StrategyGolpe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtivarGolpear {
public static void main(String[] args){

 Scanner sc = new Scanner(System.in);

 ProcessarGolpe processarGolpe = new ProcessarGolpe();

 int arma, dano;
 int vidaEnimigo = 100;

 System.out.println("Qual arma golpear?");
 System.out.println("1 - Golpear com espada");
 System.out.println("2 - Golpear com machado");
 
 
 while (true) {
    
 try{
     arma = sc.nextInt();
 }
  

 catch(InputMismatchException e){
 System.out.println("Entrada inválida! Por favor, um golpe valido.");
 sc.next();
 continue;
 }

 
 switch (arma) {
    case 1:
        dano = 30;
        processarGolpe.setStrategyGolpe(new Espada());
        processarGolpe.status(dano);
        vidaEnimigo -= dano;
        break;
    case 2:
        dano = 60;
        processarGolpe.setStrategyGolpe(new Machado());
        processarGolpe.status(dano);
        vidaEnimigo -= dano;
        break;
    default:
        System.out.println("Opção inválida, tente novamente.");
        continue;
 }

  if (vidaEnimigo <= 0) {
    System.out.println("Enimigo morto!");
    break;
  }
 

 }




 System.out.println("Fim da luta!");




 sc.close();
}
}
