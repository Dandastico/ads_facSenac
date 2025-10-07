public class Potencia {

    public double[] calcular(double[] bases) {
        double[] potencias = new double[bases.length];

        for (int i = 0; i < potencias.length; i++) {
            potencias[i] = bases[i] * bases[i];
        }

        return potencias;
    }
    
}
