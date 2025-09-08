package OrdenProduto;

public class Data implements OrdenacaoStrategy{
@Override
 public void ordenacao(double preco, String nome, String data){
    System.out.println(nome + preco);

 }
}
