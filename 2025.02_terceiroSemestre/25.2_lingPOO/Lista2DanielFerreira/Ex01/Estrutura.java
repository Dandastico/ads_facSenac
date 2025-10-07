public class Estrutura {
    
    public int[] preencherVetor() {
        int[] A = {1, 0, 5, -2, -5, 7};
        return A;
    } // fim método

    public int somarElementos(int[] A) {
        int soma = A[0] + A[1] + A[5];
        return soma;
    } // fim método

    public int[] atualizarValor(int[] A) {
        A[4] = 100;
        return A;
    } // fim método
    
} // fim classe
