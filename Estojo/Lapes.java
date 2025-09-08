package Estojo;

public class Lapes {
    private int tamanho;

    public Lapes(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
 public String toString(){
    return "O lapes do tamanho " + tamanho;
}
    
}
