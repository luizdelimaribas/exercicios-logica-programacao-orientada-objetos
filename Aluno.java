//- uma classe Aluno com atributos nome, matrícula e notas. 
//Adicione um método para calcular a média das notas.



public class Aluno {

    private String nome;
    private int matricula;
    private double media;
     


    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public double getMedia(){
        return media;
    }
    public void setMedia(double media){
        this.media = media;
    }
    

    public void calcularNota(){
       
   
   if ( media > 6 ){
    System.out.println("Aluno aprovado");
   }
   else{
    System.out.println("Aluno reprovado");
   }
       
    }


    public void informacoesAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("matricula: " + matricula);
        System.out.println("A media das notas " + media);
 
    }

}
