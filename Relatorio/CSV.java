package Relatorio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;

public class CSV implements RelatorioStrategy{
@Override
 public void criar(String[] escrita, String[] escrita2){
    String arquivoCSV = "relatorio_basico.csv";
 List<String[]> dados = Arrays.asList(escrita, escrita2);

 try(BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoCSV))){
    for(String[] linha : dados){
        writer.write(String.join(" - ", linha)); //separar por -
        writer.newLine();
    }
    System.out.println("Gerado relatórios em CSV :" + arquivoCSV);
 } catch (IOException e){
    System.err.println("Erro ao gerar o ficheiro CSV: " + e.getMessage());
 }


 } 
}
