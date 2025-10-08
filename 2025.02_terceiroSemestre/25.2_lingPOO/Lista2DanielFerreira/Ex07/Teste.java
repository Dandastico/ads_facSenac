public class Teste {
    // digite 15 notas, imprima média das 15
    public static void main(String[] args) {
        // cria objeto
        Estrutura obj = new Estrutura();

        // criar vetor
        double[] notas = obj.criarVetor(15);

        // calcular e imprimir a média
        obj.imprimirMedia(notas);
    }
}