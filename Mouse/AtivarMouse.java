package Mouse;
import java.util.Scanner;

public class AtivarMouse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String cor = null, marca = null;
        int custo = 0, valor = 0;

        System.out.println("Escolha a cor do mouse:");
        System.out.println("1- azul de valor R$10, 2- vermelho de valor R$20, 3- amarelo de valor R$50");
        int escolhaCor = sc.nextInt();

        switch (escolhaCor) {
            case 1:
                 cor = "azul";
                 valor += 10;
                break;
            case 2:
                 cor = "vermelho";
                 valor += 20;
                break;
            case 3:
                 cor = "amarelo";
                 valor += 50;
                break;

            default:
            System.out.println("Opção invalida!");
                break;
        }

        System.out.println("Escolha a marca do mouse:");
        System.out.println("1- tecX de valor R$20, 2- dadTec de valor R$50, 3- blueDragon de valor R$90");
        int opcaoMarca = sc.nextInt();

        switch (opcaoMarca) {
            case 1:
             marca = "tecX";
             valor += 20;
             break; 
            case 2:
             marca = "dadTec";
             valor += 50;
                break;
            case 3:
             marca = "blueDragon";
             valor += 90;
                break;
        
            default:
             System.out.println("Opção invalida!");
                break;
        }

      custo += valor;

        Mouse mouse = new Mouse(cor, marca, custo);

        mouse.dadosMouse();

        mouse.clicar();
    }
}
