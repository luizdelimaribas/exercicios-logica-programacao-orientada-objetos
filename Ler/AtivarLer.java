package Ler;
import java.util.Scanner;

public class AtivarLer {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

 System.out.println("Digite o caminha do arquivo para ler:");
 String caminhoArquivo = sc.nextLine();

 Ler ler = new Ler(caminhoArquivo);

 ler.LerArquivo();


 sc.close();
    }
}
