import java.util.Scanner;

public class Estrutura {
    int maior = 0;
    int posicao = 0;


    public int[] criarVetor(int tamanho) {
        int[] arr = new int[tamanho];
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros.");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número da posição "+i+": ");
            arr[i] = input.nextInt();
        }

        return arr;
    } // fim método


    public void imprimirVetor(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public void imprimirMaiorValor(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (this.maior < arr[i]) {
                this.maior = arr[i];
                this.posicao = i;
            }
        }

        System.out.println("O maior valor digitado é: " + this.maior);
    } // fim método

    public void imprimirPosicao() {
        System.out.println("Posição do maior valor: " + this.posicao);
    }
}
