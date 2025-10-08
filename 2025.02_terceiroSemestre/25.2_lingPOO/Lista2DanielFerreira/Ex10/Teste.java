
public class Teste {
    // leia um vetor de 10 posições e verifique se existem valores iguais e os escreva na tela.
    public static void main(String[] args) {
        // criar objetos
        Verificador verificador = new Verificador();
        Impressora impressora = new Impressora();

        // criar vetor e mostrar para usuário
        int[] vetor = {2, 5, 8, 2, 9, 5, 1, 8, 3, 2};

        impressora.imprimirSeparador();
        System.out.print("O vetor é: ");
        impressora.imprimirVetor(vetor);
        impressora.imprimirSeparador();

        System.out.println("Elementos duplicados encontrados:");

        // verificar elementos duplicados
        verificador.verificarDuplicados(vetor);

    }    
}
