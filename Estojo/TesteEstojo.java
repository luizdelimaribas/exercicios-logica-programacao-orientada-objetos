package Estojo;

public class TesteEstojo {
    public static void main(String[] args){
        Caneta caneta = new Caneta("Azul");

        Estojo estojo = new Estojo(caneta, null, null);

        Boracha boracha = new Boracha(" preta");

        Estojo estojo2 = new Estojo(caneta, boracha, null);

        estojo.conteudo();
        estojo2.conteudo();
        System.out.println(Estojo.getTotalItens());
        

    }
}
