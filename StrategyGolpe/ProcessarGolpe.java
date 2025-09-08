package StrategyGolpe;

public class ProcessarGolpe {
 private StrategyGolpe strategyGolpe;

 public void setStrategyGolpe(StrategyGolpe strategyGolpe) {
    this.strategyGolpe = strategyGolpe;
 }

 public void status(int dano){
    strategyGolpe.golpear(dano);
 }

 
}
