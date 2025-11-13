package percentualVotos;

import java.util.ArrayList;
import java.util.List;

public class AtivaCalculoVoto {
 public static void main(String[] args) {
    
     int totalDeVotos = 33000, branco = 15895, nulo = 3300, valido = 19800;

 List<Integer> tipos = new ArrayList<>();

 tipos.add(valido);
 tipos.add(nulo);
 tipos.add(branco);

 Voto voto = new Voto(totalDeVotos, branco, nulo, valido);

 voto.calcularPercentualDeCadaTipoVoto(tipos);








 }



}
