// um sistema em Java que permita calcular o IMC de diferentes tipos de pessoas,
//armazenar suas informações pessoais, e gerar uma classificação de saúde com base no resultado
public class Calcular_IMC {
    private String nome;
    private float peso , altura, IMC;

    public Calcular_IMC(String nome, float peso, float altura, float IMC){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.IMC = IMC;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }

    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getIMC(){
        return IMC;
    }
    public void setIMC(float IMC){
        this.IMC = IMC;
    }

    

    public void Classificação_IMC(){
        // Classificação do IMC:
       //Menos de 18,5: Abaixo do peso.

       
       System.out.println("O IMC  do " + nome + " : " + IMC + " Kg/m².");
        
       if (IMC < 18.5 ) {
        System.out.println("Abaixo do peso");
       }
       //18,5 a 24,9: Peso normal.
       
       else if (IMC >= 18.5 && IMC <= 24.9 ) {
        System.out.println("Peso normal");
       }
       //25 a 29,9: Sobrepeso.
       
       else if (IMC >= 25 && IMC <= 29.9) {
        System.out.println("Sobrepeso");
       }
       //30 a 34,9: Obesidade grau I.
       
       else if (IMC >= 30 && IMC <= 34.9) {
        System.out.println("Obesidade grau I");
       }
       //35 a 39,9: Obesidade grau II.
       
       else if (IMC >= 35 && IMC <= 39.9 ) {
        System.out.println("Obesidade grau II");
       }
       //40 ou mais: Obesidade grau III (mórbida)
       
       else {
        System.out.println("Obesidade grau III (mórbida)");
       }
    }
    
}
