package Horario;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Horario {

 Periodo periodoM = Periodo.MANHA;
 Periodo periodoT = Periodo.Tarde;   
 Periodo periodoN = Periodo.Noite;
 Periodo periodoMa = Periodo.Madrugada;

 //metodo pra mostrar a hora no formato hora:minuto:segundo
    public void mostrarhora(){
    LocalTime agora = LocalTime.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
    String horaFormatada = agora.format(formato);
    System.out.println(horaFormatada);

    }

 //metodo para descrever o periodo do dia determinado pela hora
   public void perioAtual(){
    //hora vai receber horario atual(now) 
   int hora = LocalTime.now().getHour();

   System.out.println(hora);

   //descreve o periodo se(if) for no horario determinado do periodo
    if (hora >= 6 && hora < 12) {
        System.out.println(periodoM.getPeriodoDia());
    }
    else if(hora >= 12 && hora < 18){
        System.out.println(periodoT.getPeriodoDia());
    }
    else if(hora >= 18 && hora < 00){
        System.out.println(periodoN.getPeriodoDia());
    }
    else{
        System.out.println(periodoMa.getPeriodoDia());
    }

    }

}
