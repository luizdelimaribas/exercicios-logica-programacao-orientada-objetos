 package Estojo;

public class Estojo {

    private Caneta caneta;
    private Boracha boracha;
    private Lapes lapes;
    private static int totalItens = 0;


    
    public Estojo(Caneta caneta, Boracha boracha, Lapes lapes) {
        this.caneta = caneta;
        this.boracha = boracha;
        this.lapes = lapes;
        totalItens ++;
    }



    public Caneta getCaneta() {
        return caneta;
    }




    public Boracha getBoracha() {
        return boracha;
    }




    public Lapes getLapes() {
        return lapes;
    }




    public  static int getTotalItens() {
        return totalItens;
    }


 public void conteudo(){
    System.out.println("O estojo tem " + caneta + " mais " + boracha + " mais " + lapes);
 }
 
    
}