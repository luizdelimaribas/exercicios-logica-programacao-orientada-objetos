// uma classe Livro com atributos como título,
// autor e número de páginas. Adicione um método
// para exibir as informações do livro.


public class Livro {
    private String titulo, autor;
    private int paginas;

    // construtor
    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

//metodos getter e setter
public String gettitulo(){
    return titulo;
}
public void settitulo(String titulo){
this.titulo = titulo;
}

public String getautor(){
return autor;
}
public void setautor(String autor){
    this.autor = autor;
}

public int getpaginas(){
    return paginas;
}
public void setpaginas(int paginas){
    this.paginas = paginas;
}
    
//metodo para exibir imformaçoes
public void exibiriInformacoes(){
    System.out.println("O titulo do livro: " + titulo);
    System.out.println("O autor do livro: " + autor);
    System.out.println("O volune de paginas: " + paginas);
}

}
