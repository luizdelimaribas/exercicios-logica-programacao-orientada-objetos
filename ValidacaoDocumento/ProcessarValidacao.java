package ValidacaoDocumento;

public class ProcessarValidacao {
 private ValidacaoStrategy validacaoStrategy;

 public void setValidacaoStrategy(ValidacaoStrategy validacaoStrategy) {
    this.validacaoStrategy = validacaoStrategy;
 }

  public void numeroDocumento(long documento){
    validacaoStrategy.validar(documento);
  }
}
