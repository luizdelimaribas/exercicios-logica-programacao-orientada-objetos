import java.util.Scanner;

public class Ativar {
    public static void main(String main[]){
Scanner sc= new Scanner(System.in);
 Eletronico eletronico = new Eletronico();

 System.out.println("Qual o estado do eletronico? : 1 - ligado / 2 - desligado");
 int opcao = sc.nextInt();
 
 if(opcao == 1){
    eletronico.ligar();
 }
else if (opcao == 2) {
    eletronico.desligar();
} else {
    System.out.println(" Opção invalida.Escolha entre 1 - ligado / 2 - desligado ");
}

eletronico.estado();
sc.close();
    }
    
}
