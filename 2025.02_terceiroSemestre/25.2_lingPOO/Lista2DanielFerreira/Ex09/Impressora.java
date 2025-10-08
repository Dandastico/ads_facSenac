
public class Impressora {

    public void imprimirVetor(int[] arr) {
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public void imprimirSeparador() {
        System.out.println("-------------------------------------------");
    }
    
}