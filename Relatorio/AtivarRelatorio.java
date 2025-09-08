package Relatorio;

public class AtivarRelatorio {
public static void main(String[] args){

  String[] escrita = {" gfdgdfhfgjh", "jsigjsfigj", "banana"};
  String[] escrita2 = {"vinagre" , "figado"};

 ProcessarRelatorio processarRelatorio = new ProcessarRelatorio();

 processarRelatorio.setRelatorioStrategy(new CSV());

 processarRelatorio.escrita(escrita , escrita2);

 
}
}
