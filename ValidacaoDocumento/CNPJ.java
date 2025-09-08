package ValidacaoDocumento;

public class CNPJ implements ValidacaoStrategy{
@Override
 public void validar(long documento){
System.out.println("CNPJ validado:");
 }
}
