package Tinta;
public class AtivarTinta {
    public static void main(String[] args){

        Tinta vermelho = new Vermelho();

       System.out.println(vermelho.pintar());

       Tinta azul = new Azul();

       System.out.println(azul.pintar());
    
    }
}
