import java.util.Scanner;

public class Estrutura {

    public int[] criarVetor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros");
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digito o número para a posição "+i+ ": ");
            arr[i] = input.nextInt();
        }

        return arr;
    } // fim método


    public int[] encontrarPares(int[] numeros) {
        int[] pares;
        int qntdPares = 0;
        boolean[] achou = new boolean[numeros.length]; // armazena posição do número par

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                achou[i] = true;
                qntdPares++;
            }
        }

        // nenhum número par foi encontrado
        if (qntdPares == 0) {
            pares = new int[1];
            pares[0] = -1;
            return pares;
        }

        // ao encontrar true em "achou", salve o valor em "par"
        pares = new int[qntdPares];
        for (int i = 0; i < achou.length; i++) {
            // posição em "achou" é true e número digitado não for 0
            if (achou[i] && numeros[i] != 0) {
                for (int j = 0; j < pares.length; j++) {
                    // valor armazenado é 0, transfira número par do vetor original
                    if (pares[j] == 0) {
                        pares[j] = numeros[i];
                        break;
                    }
                }
            }
        }

        return pares;


    } // fim método

}
