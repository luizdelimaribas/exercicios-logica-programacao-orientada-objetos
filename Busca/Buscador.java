package Busca;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Buscador implements BuscaStrategy{
 Scanner sc = new Scanner(System.in);


@Override
 public void busca(List<BufferedReader> arquivos, String fraseBuscada, String caminhoArquivo){


 

 List<String> encontradaBusca = new ArrayList<>();
 try{
    for(BufferedReader texto : arquivos){
        String linha;
        while ((linha = texto.readLine()) != null) {
            if (linha.contains(fraseBuscada)) {
                encontradaBusca.add(linha);
            }
        }
    }
 }
 catch(IOException e){
    e.printStackTrace();
 }
 
 System.out.println(encontradaBusca);

 }
}
