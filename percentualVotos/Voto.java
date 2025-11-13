package percentualVotos;

import java.util.List;

public class Voto {
  private int totalDeVotos, branco , nulo, valido;

  public Voto(int totalDeVotos, int branco, int nulo, int valido) {
    this.totalDeVotos = totalDeVotos;
    this.branco = branco;
    this.nulo = nulo;
    this.valido = valido;
  }

  


  public Voto() {
}




  public int getTotalDeVotos() {
    return totalDeVotos;
}




  public void setTotalDeVotos(int totalDeVotos) {
    this.totalDeVotos = totalDeVotos;
  }




  public int getBranco() {
    return branco;
  }




  public void setBranco(int branco) {
    this.branco = branco;
  }




  public int getNulo() {
    return nulo;
  }




  public void setNulo(int nulo) {
    this.nulo = nulo;
  }




  public int getValido() {
    return valido;
  }




  public void setValido(int valido) {
    this.valido = valido;
  }




  public void calcularPercentualDeCadaTipoVoto(List<Integer> tipos){
    for(int cadaTipo : tipos){
   int percentual = (cadaTipo * 100) / totalDeVotos;

   System.out.println( cadaTipo + " - " +  percentual + "%");

    }

  }
}
