package Tv;
public class Tv {
    private String marca;
    private int volume = 0,  tamanho;;
    

    public Tv(String marca, int tamanho ) {
        this.marca = marca;
        this.tamanho = tamanho;
       
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

  public void especificacaoTv(){
    System.out.println("Tv da marca: " + marca + " do tamanho: " + tamanho);
  }
    
    public void diminuirVolume(){
        volume --;
        
        if (volume <= 0) {
            System.out.println("Volume no 0");
        }
        else {System.out.println("Volume:" + volume);}
    }

    public void aumentaVolume(){
        volume ++;
         if (volume >= 100) {
            System.out.println("Volume no maximo");
        }
        else {System.out.println("Volume:" + volume);}
    }

   
}
