
public class Teste {
    // Ler 5 valores e, em seguida, mostrar a posição onde se encontram o maior e o menor valor
    public static void main(String[] args) {
        // criar objetos
        Vetor vetor = new Vetor();
        Impressora impressora = new Impressora();

        // criar vetor
        int[] arr = vetor.criarVetor(5);

        // imprimir vetor criado
        impressora.imprimirSeparador();

        System.out.print("O vetor criado foi: ");
        impressora.imprimirVetor(arr);

        impressora.imprimirSeparador();

        // métodos set para encontrar maior valor e sua posição
        vetor.setMaiorValor(arr);

        // mostrar maior valor do array e sua posição
        System.out.println("O maior valor digitado no vetor é "+ vetor.maiorValor);
        System.out.println("A posição do maior valor é: " + vetor.posicaoMaiorValor);

        impressora.imprimirSeparador();

    }
}
