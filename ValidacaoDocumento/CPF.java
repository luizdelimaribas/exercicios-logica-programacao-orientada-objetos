package ValidacaoDocumento;

public class CPF implements ValidacaoStrategy{
@Override
public void validar(long documento){
System.out.println("CPF validado:");
}
}
