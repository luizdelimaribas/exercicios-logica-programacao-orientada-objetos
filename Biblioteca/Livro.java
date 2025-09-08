package Biblioteca;

public class Livro {
    private String titulo;
    private boolean disponivel;

    public Livro(String titulo, boolean disponivel) {
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

 @Override
 public String toString(){
     return "'" + titulo + "'" + (disponivel ? " (disponível)" : " (indisponível)");
 }   

    
}


/* Operador ternário do Java — uma forma curta de escrever um if/else direto dentro 
     de uma expressão. A estrutura é:

condicao ? valorSeVerdadeiro(true) : valorSeFalso(false)
No caso:
disponivel ? " (disponível)" : " (indisponível)"


significa:
- Se disponivel for true → retorna " (disponível)"
- Se disponivel for false → retorna " (indisponível)"

 */
