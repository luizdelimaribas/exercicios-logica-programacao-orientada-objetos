package OrdenProduto;

public class ProcessarOrden {
 private OrdenacaoStrategy ordenacaoStrategy;

 public void setOrdenacaoStrategy(OrdenacaoStrategy ordenacaoStrategy) {
    this.ordenacaoStrategy = ordenacaoStrategy;
 }
 
 
 public void ordenar(double preco, String nome, String data){
    ordenacaoStrategy.ordenacao(preco, nome, data);
 }
}
