
public class Ex03 {
    // Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a coluna) do maior valor 
    public static void main(String[] args) {

        // designar espaço de memória para matriz 4x4
        int[][] matriz = new int[4][4];

        
        // instanciar objetos
        Impressora impressora = new Impressora();
        Estrutura obj = new Estrutura();


        // preencher matriz
        matriz = obj.preencherMatriz(matriz);


        // imprimir matriz
        impressora.imprimirSeparador();
        impressora.imprimirMatriz(matriz);
        impressora.imprimirSeparador();


        // imprimir maior valor
        int[] coordenadas = obj.encontrarPosicaoMaior(matriz); // array de duas posições, pos 0 é linha, pos 1 é coluna
        impressora.imprimirCoordenada(coordenadas);
        impressora.imprimirSeparador();
    }

}
