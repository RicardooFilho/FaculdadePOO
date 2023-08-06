import transportadora.TransporteNautico;
import transportadora.TransporteTerrestre;

public class Main {
    public static void main(String[] args) {
        TransporteNautico teste01 = new TransporteNautico();
        TransporteTerrestre teste02 = new TransporteTerrestre();

        System.out.println("Frete do transporte naútico: " + teste01.calculaFrete(20, 50));
        System.out.println("Frete do transporte terrestre: " + teste02.calculaFrete(20, 50));

    }
}