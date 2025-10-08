
public class Estrutura {
    
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


    public int[] encontrarPosicaoMaior(int[][] m) {
        int[] arr = new int[2];
        int maior = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (maior < m[i][j]) {
                    maior = m[i][j];
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                }
            }
        } // fim for-loop

        return arr;

    }// fim método

}
