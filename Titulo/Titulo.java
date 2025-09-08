package Titulo;

public class Titulo {

    private String nome;
    private boolean novo;
    private int quantidadeUsada;

    public Titulo(String nome, boolean novo, int quantidadeUsada) {
        this.nome = nome;
        this.novo = novo;
        this.quantidadeUsada = quantidadeUsada;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isNovo() {
        return novo;
    }
    public void setNovo(boolean novo) {
        this.novo = novo;
    }
    public int getQuantidadeUsada() {
        return quantidadeUsada;
    }
    public void setQuantidadeUsada(int quantidadeUsada) {
        this.quantidadeUsada = quantidadeUsada;
    }


    @Override
    public String toString() {
        return "Titulo: nome : " + nome + ", É novo : " + novo + ", quantidade de vezes que foram usada : " + quantidadeUsada + " .";
    }


    
}