
public class Estrutura {
    
    public int[][] preencherMatriz(int[][] matriz, int multiplicador) {

        int n = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                n++;
                matriz[i][j] = n * multiplicador;

            }
        } // fim de for-loop

        return matriz;
        
    } // fim método


    public int[][] somarMatrizes(int[][] m1, int[][] m2) {

        int[][] matrizSoma = new int[m1.length][m2[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                matrizSoma[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return matrizSoma;
    } // fim método
}
