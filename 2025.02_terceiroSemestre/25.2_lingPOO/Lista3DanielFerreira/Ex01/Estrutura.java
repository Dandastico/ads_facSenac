
public class Estrutura {

    public int compararNum(int[][] matriz) {
        int contagem = 0;
        int alvo = 10;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > alvo) {
                    contagem++;
                }
            }
        }

        return contagem;
    }
    
}
