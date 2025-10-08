import java.util.Scanner;

public class Estrutura {
    public int[] criarVetor(int tamanho) {
        int[] arr = new int[tamanho];
        Scanner input = new Scanner(System.in);

        System.out.println("Digite " + tamanho + " números inteiros.");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número da posição "+i+": ");
            arr[i] = input.nextInt();
        }

        return arr;
    } // fim método

    public void imprimirVetorReverso(int[] arr) {
        for (int i = arr.length-1 ; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
