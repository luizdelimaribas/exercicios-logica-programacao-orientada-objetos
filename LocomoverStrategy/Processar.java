package LocomoverStrategy;

public class Processar {
private LocomoverStrategy locomoverStrategy ;




public void setLocomoverStrategy(LocomoverStrategy locomoverStrategy) {
    this.locomoverStrategy = locomoverStrategy;
}


public void kms(int  km){
 locomoverStrategy.mover(km);
}


}
