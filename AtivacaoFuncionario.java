import java.util.Scanner;

public class AtivacaoFuncionario {
public static void main(String args []){
Scanner sc = new Scanner(System.in);

System.out.println("Qual o nome do funcionario: ");
String nomeFuncionario = sc.nextLine();

System.out.println("Qual o cargo do funcionario: ");
String cargoFuncionario = sc.nextLine();

System.out.println("Qual o salario do funcionario: ");
float salarioFuncionario = sc.nextFloat();

System.out.println( "Qual a porcetagem do aumento: ");
 float aumento_porcetagemFuncionario = sc.nextFloat();


 Funcionario funcionario = new Funcionario(nomeFuncionario, cargoFuncionario, salarioFuncionario, aumento_porcetagemFuncionario);

funcionario.calcularAumentoSalarial();
funcionario.informacoesFuncionario();

sc.close();
}    
}
