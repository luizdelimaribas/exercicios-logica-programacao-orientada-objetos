//- uma classe Funcionario com atributos nome, cargo e salário. 
//Adicione um método para calcular o aumento salarial.


public class Funcionario {
private String nome, cargo;
private float salario, aumento, aumento_porcetagem, salario_final;

public Funcionario(String nome, String cargo, float salario, float aumento_porcetagem){
    this.nome = nome;
    this.cargo = cargo;
    this.salario = salario;
    this.aumento_porcetagem = aumento_porcetagem;
}

public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public String getCargo(){
    return cargo;
}
public void setCargo(String cargo){
    this.cargo = cargo;
}

public float getSalario(){
    return salario;
}
public void setSalario(float salario){
    this.salario = salario;
}

public float getAumento_porcetagem(){
    return aumento_porcetagem;
}
public void setAumento_porcetagem(float aumento_porcetagem) {
    this.aumento_porcetagem = aumento_porcetagem;
}

public void calcularAumentoSalarial(){
    aumento = salario * aumento_porcetagem /100;

 salario_final = salario + aumento;
}

public void informacoesFuncionario(){
   System.out.println("Nome:" + nome);
   System.out.println("Cargo: " + cargo);
   System.out.println("Salario: " + salario);
    System.out.println("O aumento em " + aumento_porcetagem + " % do salario, da R$ " 
 + aumento + " dando um total de R$ " + salario_final + " a receber.");

}
    
}
