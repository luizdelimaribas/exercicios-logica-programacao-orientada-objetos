package Ler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ler {
    private String caminhoArquivo;

    public Ler(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void LerArquivo(){
        try(BufferedReader arquivo = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha;
            while ((linha = arquivo.readLine()) != null) {
                System.out.println(linha);
            }
        }
        catch(IOException e){
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }


    }
}
