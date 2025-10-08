// Digite 6 números, imprima os valores lidos na ordem reversa
public class Teste {
    public static void main(String[] args) {
        // criar objeto
        Estrutura obj = new Estrutura();

        // criar vetor
        int[] arr = obj.criarVetor(6);

        // imprimir vetor ao contrário
        obj.imprimirVetorReverso(arr);
    }
}
