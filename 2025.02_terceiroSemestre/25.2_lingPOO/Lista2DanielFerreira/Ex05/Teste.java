public class Teste {
    // Armazene 10 valores num vetor. Imprima-o, seu maior elemento e a posição deste elemento
    public static void main(String[] args) {
        // cria objeto
        Estrutura obj = new Estrutura();

        // cria o vetor
        int[] arr = obj.criarVetor(10);

        // imprimir vetor
        obj.imprimirVetor(arr);

        // imprimir maior elemento e sua posição
        obj.imprimirMaiorValor(arr);
        obj.imprimirPosicao();

    }
}
