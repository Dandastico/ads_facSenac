public class TesteMatriz {
    public static void main(String[] args) {
        // armaazena valor na matriz
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // percorer a matriz pela linha primeiro
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // pular linha
        } // fim de percorrer matriz
        System.out.println(); // pula linha ao terminar de imprimir 

        // percorrer pelas colunas
        for (int j = 0; j < matriz[0].length; j++)
        {
            for (int i = 0; i < matriz.length; i++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        } // fim de percorrer matriz

    } // fim main
}