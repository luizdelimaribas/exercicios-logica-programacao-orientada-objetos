package Busca;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtivarBusca {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  List<BufferedReader> arquivos = new ArrayList<>();

 String caminhoArquivo = null;
 int cantidadeTexto = 2;

  System.out.println("Digite o que e para buscar:");
 String fraseBuscada = sc.nextLine();

 for(int cadavez = 0; cadavez < cantidadeTexto; cadavez++){
 System.out.println("Digite o caminho do arquivo para a busca ou stop para encerrar:");
     caminhoArquivo = sc.nextLine();
 
 ProcessarBusca processarBusca = new ProcessarBusca(new Arquivo());
 processarBusca.buscarP(arquivos, fraseBuscada, caminhoArquivo);
 
 }

 
 ProcessarBusca processarBusca = new ProcessarBusca(new Buscador());
 processarBusca.buscarP(arquivos, fraseBuscada, caminhoArquivo);

 


 sc.close();
 }
}
