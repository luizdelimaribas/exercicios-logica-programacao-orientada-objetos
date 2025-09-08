package Estoque;

public class Produto {
    private String marca, modelo;
    private double valor;
    private static int totalProduto = 0;

    
    public Produto(String marca, String modelo, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
          totalProduto ++;
    }


    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public double getValor() {
        return valor;
    }

      public static int getTotalProduto() {
        return totalProduto;
    }

@Override
  public String toString(){
    return "Modelo: " + modelo + " , " + " Marca: " + marca;
  }

    
    
}
