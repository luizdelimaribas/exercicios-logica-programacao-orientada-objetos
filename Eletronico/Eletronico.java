package Eletronico;
public class Eletronico {

    private boolean ligado;

    // Método para ligar 
public void ligar(){
    ligado = true;
    System.out.println("O eletronico agora esta ligado.");
}

// Método para desligar
public void desligar(){
    ligado = false;
    System.out.println("O eletronico agora esta desligado.");
}
    
// Método para verificar o estado
public void estado(){
    System.out.println(ligado ? "O eletronico esta ligado." : "O eletronico esta desligado.");
}

}
