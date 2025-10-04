import java.util.Scanner;

public class Estrutura {
    
    public void imprimir(int[][] notas) {
        for (int i = 0; i < notas.length; i++)
        {
            for (int j = 0; j < notas[0].length; j++) 
            {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    } // fim do método


    public int[][] preencherMatriz(int qtdLinhas, int qtdColunas) {
        Scanner input = new Scanner(System.in); // cria objeto que lê input
        int[][] matriz = new int[qtdLinhas][qtdColunas]; // aloca espaço de memória

        // preencher a matriz
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o elemento da linha %d, coluna %d: ", i, j);
                matriz[i][j] = input.nextInt(); // armazena o valor digitado na célula
            }
        }

        return matriz;
    }


    public int[][] atualizarMatriz(int[][] matriz, int linha, int coluna, int valor) {

        // número da linha inválido
        if (linha < 0 || linha >= matriz.length) {
            System.out.println("Linha inválida!");
            return matriz;
        }

        // número da coluna inválido
        if (coluna < 0 || coluna >= matriz[0].length) {
            System.out.println("Coluna inválida");
            return matriz;
        }

        matriz[linha][coluna] = valor;
        return matriz;
    } // fim do método


    public void encontrar(int[][] matriz, int alvo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

            }
        }
    } // fim do método
}
