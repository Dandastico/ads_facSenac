import java.util.Scanner;

public class Ex04 {
    //Matriz 5 x 5. Valor  X. Busca valor na matriz e, escreve a localização (linha e coluna) ou “não encontrado”.
    public static void main(String[] args) {

        // reservar memória para matriz
        int[][] matriz = new int[5][5];


        // instanciar objetos
        Impressora impressora = new Impressora();
        Estrutura obj = new Estrutura();
        Scanner input = new Scanner(System.in);


        // pedir valor do chute
        System.out.print("Digite número inteiro: ");
        int chute = input.nextInt();


        // gerar matriz e imprimí-la
        matriz = obj.preencherMatriz(matriz);

        impressora.imprimirSeparador();
        impressora.imprimirMatriz(matriz);
        impressora.imprimirSeparador();


        // procurar valor na matriz e imprimir resultado
        if (obj.encontrarValor(matriz, chute)) { 
            System.out.printf("O valor %d está na linha %d, coluna %d.\n", chute, obj.coordenadas[0], obj.coordenadas[1]);
        } else {
            System.out.println("Não encontrado");
        }
        impressora.imprimirSeparador();

    }    

}
