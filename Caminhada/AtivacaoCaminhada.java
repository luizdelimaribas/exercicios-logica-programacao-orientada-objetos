package Caminhada;
import java.util.Scanner;

public class AtivacaoCaminhada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
      System.out.println("Qual o nome da pessoa:");
      String nome = sc.nextLine();

      System.out.println("Quantos passos percoridos pelo " + nome);
      int distancia = sc.nextInt();

     Caminhada caminhada = new Caminhada(nome, distancia);

     caminhada.caminhoPercorido();

        sc.close();
    }
}
