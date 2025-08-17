package Produto;
//uma classe Produto com atributos nome, preço e quantidade em estoque. 
//Adicione um método para calcular o valor total do estoque.

public class Produto {
 private String nome;
 private int quantidade = 0;
 private float preco = 0, valorEstoque = 0;

 public Produto(String nome, int quantidade, float preco){
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
 }
    
 public String getNome(){
    return nome;
 }
 public void setNome(String nome){
    this.nome = nome;
 }

 public int getQuantidade(){
    return quantidade;
 }
 public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
 }

 public float getPreco(){
    return preco;
 }
 public void setPreco(float preco){
    this.preco = preco;
 }

 //método para calcular o valor total do estoque
 public void calcularEstoque(){
 valorEstoque = preco * quantidade;
 }

 public void exibirProdutos(){
    System.out.println("Os produtos: " + nome + " , a quantidade: " + quantidade + " , o preço: " + preco);
 }

}