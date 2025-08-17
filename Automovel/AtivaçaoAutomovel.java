package Automovel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AtivaçaoAutomovel {
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);

        System.out.println("Qual a marca do carro:");
        String marcaCarro = sc.nextLine();

        
        System.out.println("Qual a marca do barco:");
        String marcaBarco = sc.nextLine();

        System.out.println("Qual a velocidade maxima do carro:");
        int velocidadeCarro = sc.nextInt();

        System.out.println("Qual a velocidade maxima do barco:");
        int velocidadeBarco = sc.nextInt();

        Automovel carro = new Automovel(marcaCarro, velocidadeCarro);
        Automovel barco = new Automovel(marcaBarco, velocidadeBarco);

       
      System.out.println("Digite 1 para acelerar carro");
      System.out.println("Digite 2 para acelerar barco");
      System.out.println("Digite 3 para freiar carro");
      System.out.println("Digite 4 para freiar barco");
      System.out.println("Digite 5 para encerar");
    
      int opcao;

      while (true) {
      try{
        opcao = sc.nextInt();
      }
      catch(InputMismatchException e){
          System.out.println("Entrada inválida! Por favor, um golpe valido.");
            sc.next(); 
            continue;
      }

      
        if (opcao == 5) {
         carro.imprimirCarro();
        
         barco.imprimirBarco();
         break;    
        }

        switch (opcao) {
            case 1:
               carro.acelerarCarro(); 
                break;
                
            case 2:
               barco.acelerarBarco(); 
                break;
                
            case 3:
               carro.freiarCarro(); 
                break;
                
            case 4:
               barco.freiarBarco(); 
                break;
               
            default:
             System.out.println("Opção invalida!");
                continue;
        }
    
         

        }
       
           

        sc.close();
    }
}
