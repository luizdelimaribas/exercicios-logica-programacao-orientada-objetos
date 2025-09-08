package ValidacaoDocumento;

public class AtivarValidacao {
public static void main(String[] args){
    ProcessarValidacao processarValidacao = new ProcessarValidacao();

  processarValidacao.setValidacaoStrategy(new CPF());

  processarValidacao.numeroDocumento(1234683218);

  
  processarValidacao.setValidacaoStrategy(new CNPJ());

  processarValidacao.numeroDocumento(1234683218);

  
  processarValidacao.setValidacaoStrategy(new Passaporte());

  processarValidacao.numeroDocumento(1234683218);
}
}
