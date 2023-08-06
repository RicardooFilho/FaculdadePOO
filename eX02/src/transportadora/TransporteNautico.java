package transportadora;

public class TransporteNautico extends Transportadora{
    @Override
    public double calculaFrete(double width, double height) {
        return (width + height) * 0.10;
    }
}
