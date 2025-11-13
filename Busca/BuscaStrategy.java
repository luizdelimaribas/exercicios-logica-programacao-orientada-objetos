package Busca;

import java.io.BufferedReader;
import java.util.List;

public interface BuscaStrategy {
 void busca(List<BufferedReader> arquivos, String fraseBuscada, String caminhoArquivo);
}
