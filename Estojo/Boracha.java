package Estojo;

public class Boracha {
    private String cor;

    public Boracha(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString(){
        return "A boracha de cor" + cor;
    }
    
}
