package Pessoa;
import java.util.Scanner;

public class AtivacaoPessoa {
    public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

  System.out.println("Qual o seu nome?: ");
  String nomePessoa1 = sc.nextLine();

  System.out.println("Qual a sua idade?: ");
  int idadePessoa1 = sc.nextInt();

 
 if (idadePessoa1 <= 0) {
        System.out.println("A idade não pode ser negativa.");
          
            
        }
        else{
  

  Pessoa pessoa1 = new Pessoa(nomePessoa1, idadePessoa1);

  pessoa1.exibirDadosPessoa();

  pessoa1.maioridade();

  pessoa1.apresentacao();

 }

 

 sc.close();

    }
    
}
