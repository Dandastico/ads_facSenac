public class Matriz {
    public static void main(String[] args) {
        // cria objeto da classe Estrutura
        Estrutura pedreiro = new Estrutura();

        // chama método para preencher a matriz
        int[][] matriz = pedreiro.preencherMatriz(3, 3);

        // chama método que imprime valores da matriz
        pedreiro.imprimir(matriz);
        
        System.out.println(); // quebra de linha

        // atualiza novo valor em uma célula na matriz
        matriz = pedreiro.atualizarMatriz(matriz, 2, 0, 1000);

        pedreiro.imprimir(matriz);

        matriz = pedreiro.atualizarMatriz(matriz, 3, 0, 100);
        matriz = pedreiro.atualizarMatriz(matriz, 0, 3, 100);

        // chama método para pesquisar valor na matriz
        pedreiro.encontrar(matriz, 1000); // encontrou
        pedreiro.encontrar(matriz, 999); // não encontra
    }
}
