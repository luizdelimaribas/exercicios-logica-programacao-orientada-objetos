package Estojo;

public class Caneta {

    private String cor;

    public Caneta(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

 @Override
    public String toString(){
        return "A caneta de cor " + cor;
    }
    
}
