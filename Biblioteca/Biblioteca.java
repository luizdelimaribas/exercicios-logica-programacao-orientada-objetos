
package Biblioteca;

public class Biblioteca {
   
private Cliente cliente;
private Livro livro;

public Biblioteca(Cliente cliente, Livro livro) {
    this.cliente = cliente;
    this.livro = livro;
}

public Cliente getCliente() {
    return cliente;
}

public Livro getLivro() {
    return livro;
}


public void alugar(){
    System.out.println(cliente + " esta alugando o livro " + livro);
}

public void devolucao(){
    System.out.println(cliente + " esta devolvendo o livro " + livro);
}    
    
}
