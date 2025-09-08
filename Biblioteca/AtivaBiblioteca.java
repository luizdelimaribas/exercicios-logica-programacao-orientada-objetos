 package Biblioteca;

public class AtivaBiblioteca {
public static void main(String [] args){

Cliente cliente = new Cliente("Fabio", "fabio@.com", 123333333);

Livro livro = new Livro("Mobe", false);

Biblioteca biblioteca = new Biblioteca(cliente, livro);

biblioteca.alugar();


biblioteca.devolucao();


}
    
}