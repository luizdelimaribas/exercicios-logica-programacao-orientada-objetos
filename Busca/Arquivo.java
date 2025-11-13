package Busca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Arquivo implements BuscaStrategy {
 Scanner sc = new Scanner(System.in);
 

    @Override
     public void busca(List<BufferedReader> arquivos, String fraseBuscada, String caminhoArquivo){

       
            
        try {
    BufferedReader arquivo = new BufferedReader(new FileReader(caminhoArquivo));
    arquivos.add(arquivo);
} catch (IOException e) {
    System.err.println("Erro ao ler o arquivo: " + e.getMessage());
}
      
      
      
 }
           
}
