package Horario;

public enum Periodo {
MANHA("Manha"), Tarde("Tarde"), Noite("Noite"),
 Madrugada("Madurgada");


private String periodoDia;



private Periodo(String periodoDia) {
    this.periodoDia = periodoDia;
    
}

public String getPeriodoDia() {
    return periodoDia;
}




}
