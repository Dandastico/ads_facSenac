
public class Estrutura {
    
    public int[][] preencherMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (i == j) {
                    matriz[i][j] = 1;
                    continue;
                }

                matriz[i][j] = 0;

            }
        } // fim de for-loop

        return matriz;
    } // fim método

}
