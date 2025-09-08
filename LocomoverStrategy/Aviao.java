package LocomoverStrategy;

public class Aviao implements LocomoverStrategy {
@Override
 public void mover(int km){
    System.out.println("O avição esta ha "  + km + "Km/h no ar .");
 }
}
