
public class Estrutura {
    int[] coordenadas = new int[2]; // posição é linha, posição 2 é coluna

    
    public int[][] preencherMatriz(int[][] matriz) {

        int n = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                n++;
                matriz[i][j] = n;

            }
        } // fim de for-loop

        return matriz;
        
    } // fim método


    public boolean encontrarValor(int[][] matriz, int valor) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j] ==  valor) {
                    coordenadas[0] = i + 1;
                    coordenadas[1] = j + 1;
                    return true;
                }
            }
        } // fim for-loop

        return false;
    } // fim método

}
