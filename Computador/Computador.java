package Computador;
//Crie uma classe com cinco atributos para a criação de objetos do tipo Computador. 
//A classe deve possuir dois métodos construtores
//,um sem parâmetros (construtor default) e outro com os cinco parâmetros relacionados
 //aos atributos da classe Computador. Além disso, 
 //a classe deve conter os métodos de acesso (setters e getters) para cada atributo 
 //e um método de exibição de todos os atributos denominado imprimir.
//Crie uma outra aplicação (Classe) que instancie quatro objetos do tipo Computador, 
//preencha os atributos com dados solicitados ao usuário e ao final exiba todos os atributos
 //dos quatro objetos criados invocando o método imprimir. 
 //Para criar os quatro objetos, com a metade utilize o construtor default, 
 //e com a outra metade utilize o construtor que recebe todos os atributos.
//Desenvolva a classe e a aplicação separadamente

public class Computador {
    // cinco atributos
  private boolean disponivel;
  private int memoria;
  private int hd;
  private String marca;
  private double preco;


//um contrutor sem parâmetros (construtor default)
  public Computador(){
  this.disponivel = false;
  this.hd = 0;
  this.marca = "desconhecido";
  this.memoria = 0;
  this.preco = 0.0;
  }

  //um contrutor com parâmetros
  public Computador(boolean disponivel, int memoria, int hd, String marca, double preco){
    this.disponivel = disponivel;
    this.hd = hd;
    this.marca = marca;
    this.memoria = memoria;
    this.preco = preco;
  }

  //métodos de acesso (setters e getters) para cada atributo 
  public void setdisponivel(boolean disponivel){
    this.disponivel = disponivel;
  }
  public boolean getdisponivel(){
    return disponivel;
  }
  public void sethd(int hd){
    this.hd = hd;
  }
  public int gethd(){
    return hd;
  }
  public void setmarca(String marca){
    this.marca = marca;
  }
  public String getmarca(){
    return marca;
  }
  public void setmemoria(int memoria){
    this.memoria = memoria;
  }
  public int getmemoria(){
    return memoria;
  }
  public void setpreco(double preco){
    this.preco = preco;
  }  
  public double getpreco(){
    return preco;


   }

    //para exibir todos os atributos
    public void imprimir(){

        System.out.println("A marca do computador: " + marca);
        System.out.println("A memoria do computador: " + memoria);
        System.out.println("O hd do computador: " + hd);
        System.out.println("O preco do computador: " + preco);
        System.out.println("O computador esta disponivel: " + disponivel);
       

  }

}