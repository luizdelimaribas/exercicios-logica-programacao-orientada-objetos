import java.util.Scanner;

public class AtivaçaoRetangulo {
    public static void main(String args []){
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Qual a largura? ");
 int larguraRetangulo = sc.nextInt();

 System.out.println("Qual a altura? ");
 int alturaRetangulo = sc.nextInt();

 Retangulo retangulo = new Retangulo(larguraRetangulo, alturaRetangulo);

 retangulo.exibirAlturaLargura();
 retangulo.CalcularArea();
 retangulo.CalcularPerimetro();


 sc.close();
    }
    
}
