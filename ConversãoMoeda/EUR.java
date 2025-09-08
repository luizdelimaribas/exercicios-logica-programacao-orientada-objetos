package ConversãoMoeda;

public class EUR implements ConversaoStrategy{
@Override
public void converter(double valor){
    double euro = valor * 6.40;
    System.out.println(euro);
}
}
