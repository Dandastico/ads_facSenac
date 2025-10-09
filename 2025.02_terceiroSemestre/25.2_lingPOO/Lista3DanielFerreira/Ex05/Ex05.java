
public class Ex05 {
    // Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posição das matrizes lidas.
    public static void main(String[] args) {

        // reservar memória para duas matrizes
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];


        // instanciar objetos
        Impressora impressora = new Impressora();
        Estrutura obj = new Estrutura();


        // preencher matrizes
        matriz1 = obj.preencherMatriz(matriz1, 1);
        matriz2 = obj.preencherMatriz(matriz2, 2);


        // imprimir cada matriz
        impressora.imprimirSeparador();
        System.out.println("Matriz 1: \n");
        impressora.imprimirMatriz(matriz1);

        impressora.imprimirSeparador();
        System.out.println("Matriz 2: \n");
        impressora.imprimirMatriz(matriz2);

        impressora.imprimirSeparador();


        // somar duas matrizes para gerar uma terceira
        int[][] matrizSoma = obj.somarMatrizes(matriz1, matriz2);


        // imprimir matriz soma
        System.out.println("A matriz soma é: \n");
        impressora.imprimirMatriz(matrizSoma);
        impressora.imprimirSeparador();
    }
}
