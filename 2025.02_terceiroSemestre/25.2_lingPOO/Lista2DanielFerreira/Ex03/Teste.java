public class Teste {
    public static void main(String[] args) {
        // criar objetos
        Base bases = new Base(); // array dos valores base
        Potencia potencias = new Potencia();
        Impressora impressora = new Impressora();

        // criar vetor de números reais
        double[] arrBases = bases.criarVetor();

        // calcular o quadrado de cada elemento armazenado no anterior, armazenar em outro vetor
        double[] arrPotencias = potencias.calcular(arrBases);

        // imprimir vetor original e o vetor com os valores ao quadrado
        impressora.imprimirSeparador();
        impressora.imprimirVetor(arrBases);

        impressora.imprimirSeparador();

        impressora.imprimirVetor(arrPotencias);
        impressora.imprimirSeparador();
    }
}
