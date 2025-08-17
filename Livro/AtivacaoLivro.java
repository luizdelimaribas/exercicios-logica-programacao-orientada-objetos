package Livro;
import java.util.Scanner;



public class AtivacaoLivro {
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);


System.out.println("Qual o titulo do livro?: ");
String tituloLivro1 = sc.nextLine();

System.out.println("Qual o nome do autor do livro?: ");
String autorLivro1 = sc.nextLine();

System.out.println("Quantas paginas tem o livro?: ");
int paginasLivro1 = sc.nextInt();


 Livro livro1 = new Livro(tituloLivro1 , autorLivro1 , paginasLivro1);

  livro1.exibiriInformacoes();

    sc.close();
}    
}
