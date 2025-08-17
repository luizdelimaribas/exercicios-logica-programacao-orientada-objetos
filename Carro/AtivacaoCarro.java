package Carro;
import java.util.Scanner;

public class AtivacaoCarro {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);



System.out.println("Escreva o modelo do carro: ");
 String modeloCarro1 = sc.nextLine();
 

 System.out.println("Escreva o ano do carro: ");
 int anoCarro1 = sc.nextInt();


 int velocidadeCarro1 = 100;
 

Carro carro1 = new Carro(modeloCarro1, anoCarro1, velocidadeCarro1);
 
  
  System.out.println("Digite 1 para acelerar ou 2 para frear: ");
 int acelerar = sc.nextInt();
 
 if (acelerar == 1) {
    
    carro1.acelerar();
    
    
 }

 
 else  {
    carro1.frear();
}

 

carro1.exibirCarro();



sc.close();
}    
}
