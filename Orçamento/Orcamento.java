/*algo como uma lista de dividas e usar .stream() e .filter par a somar
 e verificar se ja chegou ou orçamento 
*/
package Orçamento;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    public static void main(String[] args){
        List<Divida> dividas = new ArrayList<>();

        double orcamento = 1000.00;

       Divida contaLuz = new Divida("Luz", 150.50);
       dividas.add(contaLuz);

       Divida contaAgua = new Divida("Agua", 50.30);
       dividas.add(contaAgua);

       Divida contaIPVA = new Divida("IPVA", 235.99);
       dividas.add(contaIPVA);

       /*para teste:
       Divida contaInternet = new Divida("Internet", 1000.00);
       dividas.add(contaInternet); */

       ProcessarOrcamento processarOrcamento = new ProcessarOrcamento(new Calcular());
       processarOrcamento.processarCalculo(dividas, orcamento);



    }
    
}
