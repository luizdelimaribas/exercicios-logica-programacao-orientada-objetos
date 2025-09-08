package Relatorio;

public class PDF implements RelatorioStrategy{
 @Override
    public void criar(String[] escrita, String[] escrita2){
        System.out.println("Gerado relatórios em PDF");
    }
}
