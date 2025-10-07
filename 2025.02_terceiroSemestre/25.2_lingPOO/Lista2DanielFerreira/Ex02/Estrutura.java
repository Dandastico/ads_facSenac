import java.util.Scanner;

public class Estrutura {
    int[] arr;


    public Estrutura(int tamanhoVetor) {
        this.arr = new int[tamanhoVetor];
    }


    public int[] criarVetor() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 6 números inteiros para criar o vetor");

        for (int i = 0; i < this.arr.length; i++) {
            System.out.print("Digite o valor na posição " + i + ": ");
            this.arr[i] = input.nextInt();
        }

        return this.arr;
    } // fim método


    public void imprimirVetor(int[] arr) {
        System.out.println("-----------------------------------");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        System.out.println("-----------------------------------");
    }

} // fim classe 
