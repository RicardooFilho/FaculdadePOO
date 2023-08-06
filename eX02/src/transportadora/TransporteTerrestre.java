package transportadora;

public class TransporteTerrestre extends Transportadora{
    @Override
    public double calculaFrete(double width, double height) {
        if (width == 0 || height == 0) {
            return 0;
        }
        return (width / height) * 0.20;
    }
}
