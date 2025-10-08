
public class Vetor {
    double[] numeros;

    public Vetor() {
        double[] arr = {
            10.0,
            20.0,
            -5,
            -10,
            -100,
            10000.0,
            7,
            3,
            -1,
            -3
        };

        this.numeros = arr;
    }

    public void imprimirQntdNegativos() {
        int qntdNegativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                qntdNegativos++;
            }
        }

        System.out.println("Há " + qntdNegativos + " números negativos no vetor.");
    } //fim método

    public void imprimirSomaPositivos() {
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                soma += numeros[i];
            }
        }

        System.out.println("A soma dos números positivos no vetor é: " + soma);
    }
}
