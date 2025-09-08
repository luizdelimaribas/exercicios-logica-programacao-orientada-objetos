package LocomoverStrategy;

public class Cliente {
public static void main(String[] args){

 Processar processar = new Processar();

 processar.setLocomoverStrategy(new Barco());

 processar.kms(100);

 processar.setLocomoverStrategy(new Aviao());

 processar.kms(30);

 processar.setLocomoverStrategy(new Caminhonete());

 processar.kms(60);
}
}
