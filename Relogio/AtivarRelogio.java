package Relogio;
public class AtivarRelogio {
    public static void main(String[] args){


  Relogio relogioPulso = new Relogio( 40.69, "prata");

  Relogio relogioParede = new Relogio( 60.55, "branco");


 relogioParede.caracteristicas();
 relogioParede.mostrarhora();

 relogioPulso.caracteristicas();
 relogioPulso.mostrarhora();



    }
}
