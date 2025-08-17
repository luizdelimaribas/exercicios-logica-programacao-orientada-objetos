package Conta;
public class Conta {
    private double saldo;
    Integer conta;

    

    public Conta(double saldo, Integer conta) {
        this.saldo = saldo;
        this.conta = conta;
    }





    
    public double getSaldo() {
        return saldo;
    }






    public Integer getConta() {
        return conta;
    }






    public void sacar(double saque){
        if (saque > saldo || saque <= 0) {
            System.out.println("Valor invalido");
        }
        else{
       saldo -= saque;}
    }

    public void depositar(double deposito){
       if (deposito <= 0) {
        System.out.println("Valor invalido ");
       }
       else{
       saldo += deposito;}
    
    }

    public void saldo(){
        System.out.println("Seu saldo e de:" + saldo);
    }



   
}
