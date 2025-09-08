package ConversãoMoeda;

public class USD implements ConversaoStrategy{
@Override
 public void converter(double valor){
    double dolar = valor * 5.50;
    System.out.println(dolar);
 }
}
