import java.util.Scanner;

public class Vetor {
    int maiorValor;
    int posicaoMaiorValor;
    
    public int[] criarVetor(int tamanho) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[tamanho];

        System.out.println("Digite " + tamanho + " números inteiros para preenhcer o vetor");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número inteiro da posição "+ i + ": ");
            arr[i] = input.nextInt();
        }

        return arr;
    } // fim método


    public void setMaiorValor(int[] arr) {
        int maior = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maior < arr[i]) {
                maior = arr[i];
                this.posicaoMaiorValor = i;
            }
        }

        this.maiorValor = maior;
    } // fim método

}
