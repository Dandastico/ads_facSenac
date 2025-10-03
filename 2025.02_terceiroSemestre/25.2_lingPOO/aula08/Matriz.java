public class Matriz {
    public static void main(String[] args) {
        // cria objeto da classe Estrutura
        Estrutura pedreiro = new Estrutura();

        // chama método para preencher a matriz
        int[][] matriz = pedreiro.preencherMatriz(3, 3);

        // chama método que imprime valores da matriz
        pedreiro.imprimir(matriz);
    }
}
