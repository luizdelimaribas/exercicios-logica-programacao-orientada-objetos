

public class Pedido {

 private long numeroPedido;   
 private Produto produto;
 private Cliente cliente;

 public Pedido(Produto produto, Cliente cliente, long numeroPedido) {
    this.produto = produto;
    this.cliente = cliente;
    this.numeroPedido = numeroPedido;
 }
 public Produto getProduto() {
    return produto;
 }
 public void setProduto(Produto produto) {
    this.produto = produto;
 }
 public Cliente getCliente() {
    return cliente;
 }
 public void setCliente(Cliente cliente) {
    this.cliente = cliente;
 }
 public long getNumeroPedido() {
    return numeroPedido;
 }
 
 
}
