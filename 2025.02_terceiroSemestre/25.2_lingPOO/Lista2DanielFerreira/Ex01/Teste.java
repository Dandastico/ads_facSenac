public class Teste {
    public static void main(String[] args) {

        // criar objeto da classe
        Estrutura obj = new Estrutura();

        // 1 - Implemente um método que atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7
        int[] A = obj.preencherVetor();

        // 2 - Somar alguns dos valores e imprimir na tela
        System.out.println("A soma dos valores A[0], A[1] e A[5] é: " + obj.somarElementos(A));

        // 3 - Alterar valor na posição 4 e imprimir o vetor atualizado
        A = obj.atualizarValor(A);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "  ");
        }
    }
}
