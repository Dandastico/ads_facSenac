public class Teste {
    public static void main(String[] args) {
        // 4- Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui. 

        // cria objetos
        Estrutura obj = new Estrutura();
        Impressora impressora = new Impressora();

        // cria vetor
        int[] vetor = obj.criarVetor(10);
        
        // verifica quais elementos do vetor são pares
        int[] pares = obj.encontrarPares(vetor);

        // imrpimir os números pares
        impressora.imprimirSeparador();

        if (pares.length > 1 && pares[0] != -1) {
            impressora.imprimirVetor(pares);
        } else {
            System.out.println("Nenhum número digitado é par.");
        }

    }
}