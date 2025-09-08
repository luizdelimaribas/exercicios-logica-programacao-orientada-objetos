package LocomoverStrategy;

class Barco implements LocomoverStrategy{

  
 @Override
public void mover(int km){
  System.out.println("O barco esta ha "  + km + "Km/s .");
}
    
}