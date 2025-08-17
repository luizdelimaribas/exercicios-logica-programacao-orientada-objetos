package Fogao;

import java.util.Scanner;

public class AtivacaoFogao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
    
        System.out.println("Qual a marca do fogão:");
        String marcaFogao = sc.nextLine().trim();

       

        System.out.println("Quantas bocas tem o fogão:");
        int bocasFogao =sc.nextInt();

         sc.nextLine();


        System.out.println("Qual o tamanho do fogão em metros:");
        int tamanhofogao = sc.nextInt();

         sc.nextLine();

       
        
     Fogao fogao = new Fogao(tamanhofogao, bocasFogao, marcaFogao);

        fogao.exibirinformacoes();


     

        sc.close();
    }
    
}
