package Relogio;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Relogio {
    private double valor;
    private String cor;
    
    public Relogio(double valor, String cor) {
        this.valor = valor;
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

  public void caracteristicas(){
    System.out.println("A cor do relogio: " + cor);
    System.out.println("O valor do relogio: R$" + valor);
  }

    public void mostrarhora(){
        LocalTime agora = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = agora.format(formato);
        System.out.println(horaFormatada);
    }

}
