package CalculadoraDesconto;

public class CalcularDesconto {
public static void main(String[] args){

    var valor = 1000;
    var desconto = 10;
    var descontoFixo = 5;

    Processar processar = new Processar();

    


 processar.setDescontoStrategy(new Percentual());

 processar.calcular(valor, desconto, descontoFixo);
 
 processar.setDescontoStrategy(new SemDesconto());

 processar.calcular(valor, desconto, descontoFixo);
 
 processar.setDescontoStrategy(new ValorFixo());

 
processar.calcular(valor, desconto, descontoFixo);
}
}
