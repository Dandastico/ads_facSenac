
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


    public int somarImpares(int[][] matriz) {

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 1) {
                    soma += matriz[i][j];
                }
            }
        }

        return soma;
    } // fim método


    public int somarLinha(int[][] matriz, int i) {
        int soma = 0;

        for (int j = 0; j < matriz[0].length; j++) {
            soma += matriz[i][j];
        }

        return soma;
    } // fim método



    public int somarColuna(int[][] matriz, int j) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][j];
        }

        return soma;
    } // fim método

}
