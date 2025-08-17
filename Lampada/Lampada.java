package Lampada;
public class Lampada {
private String marca;
private boolean ligada;

//contrutor
 public Lampada(boolean ligada, String marca){
    this.marca = marca;
    this.ligada = ligada;
   
 }

 //metodos getter e setter

 public String getmarca(){
    return marca;
 }

 public void setmarca(String marca){
    this.marca = marca;
 }

 public boolean getligada(){
    return ligada;
 }

 public void setligada(boolean ligada){
    this.ligada = ligada;
 }

 //metodo para exibir as informações

 public void exibirinformacoes(){
    System.out.println("A marca: " + marca);
    System.out.println("A lampada esta ligada?: " + ligada);
 }
    
}