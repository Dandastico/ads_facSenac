import java.util.Scanner;

public class Base {
    int tamanho;
    double[] vetor;

    public Base() {
        Scanner  input = new Scanner(System.in);
        System.out.print("Digite tamanho do vetor que será criado: ");

        this.tamanho = input.nextInt();
        this.vetor = new double[tamanho];
    } // fim construtor


    public double[] criarVetor() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite %d números reais que vão compor o vetor\n", this.tamanho);

        for (int i = 0; i < this.tamanho; i++) {
            System.out.print("Valor na posição " + i + ": ");
            vetor[i] = input.nextDouble();
        }

        return this.vetor;
    } // fim método
    
}
