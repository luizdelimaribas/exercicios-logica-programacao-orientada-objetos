package ConversãoMoeda;

public class AtivarConversao {
public static void main(String[] args){



    ProcessarConversao processarConversao = new ProcessarConversao();

    processarConversao.setConversaoStrategy(new BRL());
        processarConversao.valor(100.55);


    processarConversao.setConversaoStrategy(new EUR());
         processarConversao.valor(100.55);


    processarConversao.setConversaoStrategy(new USD());
         processarConversao.valor(100.55);
}
}
