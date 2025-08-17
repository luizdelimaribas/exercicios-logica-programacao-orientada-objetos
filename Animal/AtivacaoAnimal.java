package Animal;
//peixes, anfíbios, répteis, aves e mamíferos

import java.util.ArrayList;
import java.util.List;

public class AtivacaoAnimal {
    public static void main(String[]args){

        
    Animais animal = new Animais();

     animal.mover();

    Peixes peixe = new Peixes();

     peixe.mover();

    Anfibios anfibio = new Anfibios();

     anfibio.mover();
    
    Repteis repetil = new Repteis();

     repetil.mover();

    Aves ave = new Aves();

     ave.mover();

    Mamiferos mamifero = new Mamiferos();

     mamifero.mover();

    Animais papaguaio = new Aves();
    
     papaguaio.mover();

    Animais cachorro = new Mamiferos();

     cachorro.mover();

    Animais anim = (Animais) peixe;

     anim.mover();

    Animais anima = (Animais) repetil;

     anima.mover();

     for(int x = 1; x < 100; x++){
     System.out.print("-");
     }

     System.out.println();

    List<Animais> listaAnimais = new ArrayList<>();

    listaAnimais.add(peixe);
    listaAnimais.add(mamifero);
    listaAnimais.add(repetil);
    listaAnimais.add(anfibio);
    listaAnimais.add(ave);
     
    for(Animais bicho : listaAnimais){
        bicho.mover();
    }

    }
}
