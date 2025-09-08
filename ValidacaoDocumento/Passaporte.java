package ValidacaoDocumento;

public class Passaporte implements ValidacaoStrategy{
@Override
 public void validar(long documento){
System.out.println("Passaporte validado:");
 }
}
