
public class Verificador {

    public void verificarDuplicados(int[] arr) {
        boolean encontrouDuplicados = false;

        // procurar elementos duplicados
        for (int i = 0; i < arr.length; i++) {
            boolean processado = false;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    processado = true;
                    break;
                } 
            }

            // se o valor i ainda não foi processado, verifica duplicação
            if (!processado) {
                int contador = 0;
                for (int k = i; k < arr.length; k++) {
                    if (arr[i] == arr[k]) {
                        contador++;
                    }
                }

                if (contador > 1) {
                    System.out.println(arr[i] + " - aparece " + contador + " vezes.");
                    encontrouDuplicados = true;
                } 
            }
        } // fim de for-loop

        if (!encontrouDuplicados) {
            System.out.println("Não existem valores duplicados no vetor.");
        }

    } // fim método
    
}
