package Contato;
import java.util.Scanner;

public class AtivacaoContato {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nomeContato = sc.nextLine();

        System.out.println("Digite o email: ");
        String emailContato = sc.nextLine();

        System.out.println("Digite o telefone: ");
        Integer telefoneContato = sc.nextInt();


     Contato contato = new Contato(nomeContato, emailContato, telefoneContato);

     contato.informoesContato();

sc.close();
    }
}
