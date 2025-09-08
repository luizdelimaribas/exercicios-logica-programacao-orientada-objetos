package LocomoverStrategy;

public class Caminhonete implements LocomoverStrategy {
@Override
 public void mover(int km){
    System.out.println("A caminhonete esta ha "  + km + "Km/h na terra.");
 }
}
