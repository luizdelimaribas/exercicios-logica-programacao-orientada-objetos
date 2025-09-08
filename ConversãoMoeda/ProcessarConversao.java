package ConversãoMoeda;

public class ProcessarConversao {
 private ConversaoStrategy conversaoStrategy ;

 public void setConversaoStrategy(ConversaoStrategy conversaoStrategy) {
    this.conversaoStrategy = conversaoStrategy;
 }

 public void valor(double valor){
    conversaoStrategy.converter(valor);
 }
}
