package Fogao;
public class Fogao {
    private int tamanho;
    private int bocas;
    private String marca;
 
    
    public Fogao() {
    }


    public Fogao(int tamanho, int bocas, String marca) {
        this.tamanho = tamanho;
        this.bocas = bocas;
        this.marca = marca;
        
    }


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        if (tamanho <= 0) {
            throw new IllegalArgumentException("Tamanho invalido");
        }
        this.tamanho = tamanho;
    }

    public int getBocas() {
        return bocas;
    }

    public void setBocas(int bocas) {
        if (bocas <= 0) {
            throw new IllegalArgumentException("Quantidade de bocas do fogão e invalido.");
        }
        this.bocas = bocas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        //isBlank() e para a string nao ser vazia em branco
        if (marca == null || marca.isBlank()) {
        //lança novo argumento errado
            throw new IllegalArgumentException("Marca não pode ser nulo ou vazio.");
        }
        this.marca = marca.trim();
          /*O trim() e para remover espaços em branco no início e no final da string 
        antes de atribuí-la à variável de instância this.varial.
         Isso evita que espaços em branco indesejados afetem a lógica da aplicação
          ou a apresentação de dados. */ 
    }


   


    public void exibirinformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("O forno tem " + bocas + " bocas");
        System.out.println("O tamanho do forno e: " + tamanho + " metros");
       
    }
 

    
}
