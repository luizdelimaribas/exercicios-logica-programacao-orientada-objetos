package Lampada;
public class UsoLampada {
    public static void main(String args[]){
        Lampada  lampada1 = new Lampada(false, "npkkp");
        Lampada  lampada2 = new Lampada(false, "ssl");
        Lampada  lampada3 = new Lampada( true , "sdg");

      lampada1.exibirinformacoes();
      lampada2.exibirinformacoes();
      lampada3.exibirinformacoes();

    }
}
