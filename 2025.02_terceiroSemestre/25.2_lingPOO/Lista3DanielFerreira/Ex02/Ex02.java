
public class Ex02 {
    // Matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos. Imprima matriz
    public static void main(String[] args) {

        // reservar memória para matriz
        int[][] matriz = new int[5][5];

        
        // criar objetos
        Impressora impressora = new Impressora();
        Estrutura obj = new Estrutura();


        // preencher matriz
        matriz = obj.preencherMatriz(matriz);

        // imprimir matriz
        impressora.imprimirSeparador();

        impressora.imprimirMatriz(matriz);

        impressora.imprimirSeparador();


    }
}
