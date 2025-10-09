
public class Impressora {
    
    public void imprimirSeparador() {
        System.out.println("----------------------------------");
    } // fim método


    public void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    } // fim método
}
