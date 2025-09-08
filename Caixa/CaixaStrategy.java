//metodo para colocar item na caixa, e outrro metodo para retirar

package Caixa;

import java.util.List;

public interface CaixaStrategy {
 void caixa(List<String> listaItens, String item);
 
}
