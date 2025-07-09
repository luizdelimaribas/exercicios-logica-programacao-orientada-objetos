//- uma classe Carro com atributos como modelo,
// ano e velocidade. Adicione métodos para acelerar e frear.


public class Carro {
    private String modelo;
    private int ano , velocidade;

    public Carro(String modelo, int ano, int velocidade){
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }


    public String getmodelo(){
        return modelo;
    }
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }

    public int getano(){
        return ano;
    }
    public void setano(int ano){
        this.ano = ano;
    }

    public int getvelocidade(){
        return velocidade;
    }
    public void setvelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public void acelerar(){
        System.out.println("O carro esta acelerando!");
    }

    public void frear(){
        System.out.println("O carro esta freando!");
    }
    
   public void exibirCarro(){
    System.out.println("Modelo: " + modelo + " ano: " + ano);
    System.out.println("O carro esta ha " + velocidade + "km/s");
   }

}
