//uma classe Retangulo com atributos largura e altura.
// Adicione métodos para calcular a área e o perímetro.


public class Retangulo {
    private int largura, altura, area, perimetro;

    public Retangulo(int largura, int altura){
        this.largura = largura;
        this.altura = altura;
       

    }

    public int getLargura(){
        return largura;
    }
    public void setLargura(int largura){
        this.largura = largura;
    }

    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }

   
    public void exibirAlturaLargura(){
        System.out.println("A largura de " + largura + " e a altura de " + altura);
    }


    //métodos para calcular a área e o perímetro
    public void CalcularArea(){
   //Área = largura * altura

   area = largura * altura;
   System.out.println("A area e de: " + area);

    }

    public void CalcularPerimetro(){
       // Perímetro = 2 * (largura + altura) 

       perimetro = 2 * (largura + altura);
     System.out.println("O perimetro e de : " + perimetro);
    
    }
}