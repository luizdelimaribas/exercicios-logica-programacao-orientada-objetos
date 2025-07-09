import java.util.Scanner;

public class Aplicacao {
    public static void main (String args[]){

//preencha os atributos com dados solicitados ao usuário
    Scanner sc = new Scanner(System.in);
 
    Computador computador1 = new Computador();
    System.out.println("Qual o tamnho do HD do primeiro computador: ");
    computador1.sethd(sc.nextInt());
    sc.nextLine();
    System.out.println("Tem disponivel no estoque: ");
    computador1.setdisponivel(sc.nextBoolean());
    sc.nextLine();
    System.out.println("Qual o tamnho de memoria do primeiro computador: "); 
    computador1.setmemoria(sc.nextInt());
    sc.nextLine();
    System.out.println("Qual a marca do primeiro computador: ");
    computador1.setmarca(sc.nextLine());
    System.out.println("Qual o preço do primeiro computador: ");
    computador1.setpreco(sc.nextDouble());
    
    System.out.println("-----------------------");
    
    System.out.println("Qual o tamnho do HD do segundo computador: ");
    int hdComputador2 = sc.nextInt();
    sc.nextLine();
    System.out.println("Tem disponivel no estoque: ");
    boolean disponivelComputador2 = sc.nextBoolean();
    sc.nextLine();
    System.out.println("Qual o tamnho de memoria do segundo computador: ");
    int memoriaComputador2 = sc.nextInt();
    sc.nextLine();
    System.out.println("Qual a marca do segundo computador: ");
    String marcaComputador2 = sc.nextLine();
    System.out.println("Qual o preço do segundo computador: ");
    double precoComputador2 = sc.nextDouble();
    sc.nextLine();

    Computador computador2 = new Computador (disponivelComputador2, 
    memoriaComputador2,hdComputador2, marcaComputador2, precoComputador2);


    //exibir todos os atributos
    System.out.println("Os atributos dos computadores são: ");
    computador1.imprimir();
    computador2.imprimir();



    sc.close();
    }
    
}
