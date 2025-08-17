package Motor;
public class ativarMotor {
    public static void main(String[] args){
        Motor motor = new Motor(150);
        Automovel automovel = new Automovel(motor);

       System.out.println("A potencia do motor: " + automovel.getMotor().getPotencia() + " cilindradas");
    }
}
