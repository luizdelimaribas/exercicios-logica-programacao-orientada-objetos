package StrategyGolpe;

public class Espada implements StrategyGolpe{
@Override
 public void golpear(int dano){
    System.out.println("Aplicado " + dano + " dano de espada " );
 }
}
