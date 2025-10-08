
public class Ex01 {
    // Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
    public static void main(String[] args) {
        // inicializar matriz
        int[][] matriz = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // criar objetos
        Impressora impressora = new Impressora();
        Estrutura obj = new Estrutura();

        
        // mostrar matriz criada para usuário
        impressora.imprimirSeparador();

        impressora.imprimirMatriz(matriz);

        impressora.imprimirSeparador();

        
        // contar quantidade de valores maior que 10 e imprimir a quantidade
        System.out.println("Há " + obj.compararNum(matriz) + " números maiores que 10 na matriz.");
        impressora.imprimirSeparador();

    }
}
