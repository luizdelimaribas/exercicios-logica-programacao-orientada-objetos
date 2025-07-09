import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtivacaoAluno {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

  System.out.println("Qual o nome do aluno: ");
  String nomeAluno = sc.nextLine();

  System.out.println("Qual a matricula: ");
  int matriculaAluno = sc.nextInt();

  Aluno aluno = new Aluno(nomeAluno, matriculaAluno);

       List<Double> notas = new ArrayList<>();
  Double media;
  double soma = 0;

 //leia as notas de um aluno

 while (true) {

    System.out.println("Qual a nota do aluno ou digite (PARAR) para encerrar: ");
 try{
  double nota = sc.nextDouble();
  notas.add(nota);
 System.out.println("Nota registrada.");
 }
    catch (java.util.InputMismatchException e){
        String paradaleitura = sc.next();
        if (paradaleitura.equalsIgnoreCase("parar")){
            break;
        }

System.out.println("Nota invalida. Por favor, digite uma nota valida ou PARAR: ");
continue;
 }
 sc.nextLine();
}

  for (Double nota : notas){
    soma += nota;
  }

  media = notas.isEmpty() ? 0: soma / notas.size();
  aluno.setMedia(media);

   System.out.println("As notas sao: " + notas + " e a media das notas " + media);
 
  
  aluno.calcularNota();

 sc.close();
    }
    
}

