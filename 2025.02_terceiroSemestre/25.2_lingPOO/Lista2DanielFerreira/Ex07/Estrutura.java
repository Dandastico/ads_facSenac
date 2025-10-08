import java.util.Scanner;

public class Estrutura {
    public double[] criarVetor(int tamanho) {
        double[] arr = new double[tamanho];
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota dos " + tamanho + " alunos");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i+1);
            arr[i] = input.nextDouble();
        }

        return arr;
    } // fim método

    public void imprimirMedia(double[] arr) {
        double tamanho = arr.length;
        double soma = 0;

        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }

        System.out.println("A média das turmas é: " + soma/tamanho);
    }
    
}
