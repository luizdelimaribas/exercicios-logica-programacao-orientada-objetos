package IMC;
import java.util.Scanner;

public class Ativacao_CalcularIMC {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);


  System.out.println("Qual o nome do pessoa: ");
     String nomeCalcular_IMC = sc.nextLine();

 System.out.println("Qual o peso em Kg: ");
     float pesoCalcular_IMC = sc.nextFloat();

 System.out.println("Qual a altura metros: ");
     float alturaCalcular_IMC = sc.nextFloat();

  //Calcule IMC a partir de peso/altura
        float IMC = pesoCalcular_IMC / (alturaCalcular_IMC * alturaCalcular_IMC);
        
        
        Calcular_IMC calculoImc = new Calcular_IMC(nomeCalcular_IMC, pesoCalcular_IMC, alturaCalcular_IMC, IMC);


 calculoImc.Classificação_IMC();

    }
    
}
