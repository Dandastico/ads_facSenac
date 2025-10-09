
public class Ex06 {
    /* 
        Faça um algoritmo que preencha uma matriz 5x5 de inteiros e escreva: 
        - a soma dos números ímpares fornecidos;
        - a soma de cada uma das 5 colunas; 
        - a soma de cada uma das 5 linhas. 
     */
    public static void main(String[] args) {

        // reservar espaço de memória para matriz
        int[][] matriz = new int[5][5];


        // instanciar objetos
        Impressora impressora = new Impressora();
        Estrutura obj = new Estrutura();


        // preencher matriz
        matriz = obj.preencherMatriz(matriz);


        // imrpimir matriz;
        impressora.imprimirSeparador();
        impressora.imprimirMatriz(matriz);
        impressora.imprimirSeparador();


        // imprimir soma dos números ímpares
        System.out.println("A soma dos números ímpares no vetor é: " + obj.somarImpares(matriz));
        impressora.imprimirSeparador();


        // imprimir a soma de cada linha
        int linha;
        for (int i = 0; i < matriz.length; i++) {
            linha = i+1;
            System.out.println("A soma da linha "+ linha +" é: " + obj.somarLinha(matriz, i));
        }
        impressora.imprimirSeparador();

        // imprimir a soma de cada coluna
        int coluna;
        for (int i = 0; i < matriz[0].length; i++) {
            coluna = i+1;
            System.out.println("A soma da coluna " + coluna + " é: " + obj.somarColuna(matriz, i));
        }
        impressora.imprimirSeparador();
    }
}
