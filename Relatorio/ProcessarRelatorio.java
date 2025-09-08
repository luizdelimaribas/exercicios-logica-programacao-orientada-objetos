package Relatorio;

public class ProcessarRelatorio {
 private RelatorioStrategy relatorioStrategy;

 public void setRelatorioStrategy(RelatorioStrategy relatorioStrategy) {
    this.relatorioStrategy = relatorioStrategy;
 }


 public void escrita(String[] escrita, String[] escrita2){
    relatorioStrategy.criar(escrita, escrita2);
 }
}
