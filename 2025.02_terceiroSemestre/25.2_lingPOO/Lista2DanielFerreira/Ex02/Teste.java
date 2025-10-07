public class Teste {
    public static void main (String[] args) {

        // criar objeto
        Estrutura obj = new Estrutura(6);

        // pedir os valores para criar vetor
        int[] arr = obj.criarVetor();

        // imprimir na tela o vetor criado
        obj.imprimirVetor(arr);

    }
}
