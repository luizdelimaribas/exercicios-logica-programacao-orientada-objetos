package Busca;

import java.io.BufferedReader;
import java.util.List;

public class ProcessarBusca {
 private BuscaStrategy buscaStrategy;

 public ProcessarBusca(BuscaStrategy buscaStrategy) {
    this.buscaStrategy = buscaStrategy;
 }

 public void buscarP(List<BufferedReader> arquivos, String fraseBuscada, String caminhoArquivo){
    buscaStrategy.busca(arquivos, fraseBuscada, caminhoArquivo);
 }
}
