//- - uma classe Pessoa com atributos nome e idade. 
//Adicione um método que verifica se a pessoa é maior de idade.



public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }
    
    public int getidade(){
        return idade;
    }

    public void setidade(int idade){
        this.idade = idade;
    }

    public void exibirDadosPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

}
