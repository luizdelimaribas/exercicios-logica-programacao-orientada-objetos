package Mouse;
public class Mouse {
    private String cor, marca;
    private int custo;
    
    public Mouse(String cor, String marca, int custo) {
        this.cor = cor;
        this.marca = marca;
        this.custo = custo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public void dadosMouse(){
        System.out.println("Você escolheu a marca " + marca );
        System.out.println("Você escolheu a cor " + cor );
        System.out.println("Do mouse de valor R$" + custo );
    }

    public void clicar(){
        System.out.println("Você esta clicando com o mouse.");
    }
}
