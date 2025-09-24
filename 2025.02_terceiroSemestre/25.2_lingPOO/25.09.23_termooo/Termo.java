// Clone do jogo termo pelo terminal
/* Preciso de:
 * um array com palavras aleatórias armazenadas
 * um método que seleciona um dos valores armazenados no array acima
 * um for-loop com no máximo 5 tentativas
 * comparar cada caractere da tentativa com a palavra-alvo
 * demonstrar uma das 3 alternativas do caractere (lugar certo, lugar errado e caractere errado)
 * sair do for-loop se o chute for igual ao alvo
*/

import java.util.Scanner;

class Termo {
    public final static int TENTATIVAS = 5;
    public final static String SEPARADOR_HORIZONTAL = "----------------------------------------------------";

    public static void main(String[] args) {
        // gera o alvo
        Palavras palavra = new Palavras();
        String alvo = palavra.selecionarPalavra().toUpperCase();

        // variável que vai armazenar os chutes
        String chute = "";

        //instancia o verificador com o alvo
        Verificador verificador = new Verificador(alvo);

        System.out.println(SEPARADOR_HORIZONTAL);
        System.out.println("Bem vindo ao Joguinho Supimposo!\nVocê tem 5 chances para acertar a palavra!");
        System.out.println(SEPARADOR_HORIZONTAL);

        //instancia objeto Scanner
        Scanner input = new Scanner(System.in);

        // começar for-loop para contabilizar tentativas
        for (int turno = 0; turno < TENTATIVAS; turno++)
        {
            //pede pelo input
            System.out.print(turno+1+"º tentativa -> "); //texto guia do input
            chute = input.nextLine().toUpperCase(); //variável que armazena input

            //verifica cada caractere e imprime o resultado de cada um
            verificador.setChute(chute); //cada chute precisa jogar no objeto
            verificador.verificar();

            //acertou o alvo, sai do for-loop
            if(chute.equals(alvo)) {
                System.out.println(SEPARADOR_HORIZONTAL+"\nVocê ganhou!\n"+SEPARADOR_HORIZONTAL);
                break;
            }
        }

        // errou cinco vezes
        if (!chute.equals(alvo))
        {
            System.out.println(SEPARADOR_HORIZONTAL);
            System.out.println("Você fracassou miseravelmente");
            System.out.println(SEPARADOR_HORIZONTAL);
        }
    }
}