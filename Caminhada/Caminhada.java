package Caminhada;
public class Caminhada {
    private String nome;
    private int distancia;
    
    public Caminhada(String nome, int distancia) {
        this.nome = nome;
        this.distancia = distancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }


public void caminhoPercorido(){
    Double percorido =  distancia * 0.8;
    System.out.println(nome + " percoreu " + percorido + " metros cada passo equivale a 0,8 metros.");
}


    
}
