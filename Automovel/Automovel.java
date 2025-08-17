package Automovel;
public class Automovel {
 private String marca;
 private int velocidadeMaxima;
 
 public Automovel() {
 }

 public Automovel(String marca, int velocidadeMaxima) {
    this.marca = marca;
    this.velocidadeMaxima = velocidadeMaxima;
 }

 public String getMarca() {
    return marca;
 }

 public void setMarca(String marca) {
    this.marca = marca;
 }

 public int getVelocidadeMaxima() {
    return velocidadeMaxima;
 }

 public void setVelocidadeMaxima(int velocidadeMaxima) {
    this.velocidadeMaxima = velocidadeMaxima;
 }
 
 int velocidadeAtual = 0;
 //metodo
 public void acelerarCarro(){
    System.out.println("Acelerando.");
     velocidadeAtual += 10;

         System.out.println("O carro esta á: " + velocidadeAtual + "km/h");
 }

 public void freiarCarro(){
    System.out.println("Freiando");
    velocidadeAtual -= 10;
     
     System.out.println("O carro esta á: " + velocidadeAtual + "km/h");
}
    
 public void acelerarBarco(){
    System.out.println("Acelerando.");
     velocidadeAtual += 10;

          System.out.println("O barco esta á: " + velocidadeAtual + "km/h"); 
 }
 
 public void freiarBarco(){
    System.out.println("Freiando");
    velocidadeAtual -= 10;
      System.out.println("O barco esta á: " + velocidadeAtual + "km/h"); 
     
}



 public void imprimirCarro(){
    System.out.println("A marca do carro é: " + marca);
    System.out.println("A velocidade maxima do carro é: " + velocidadeMaxima);
    
 }

 public void imprimirBarco(){
    System.out.println("A marca do barco é: " + marca);
    System.out.println("A velocidade maxima do barco é: " + velocidadeMaxima);
 }

}