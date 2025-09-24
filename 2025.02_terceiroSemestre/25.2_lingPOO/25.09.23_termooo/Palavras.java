import java.util.Random;

public class Palavras {
    String[] palavras = {
        "palco",
        "feios",
        "valor",
        "carol",
        "jordan",
        "costa",
        "notas",
        "batom",
        "bonde",
        "milho"
    }; //comprimento = 10

    private static Random random = new Random(); // criando objeto random

    public String selecionarPalavra() {    
        int indexAleatorio = random.nextInt(palavras.length); //0 a 9
        return palavras[indexAleatorio]; // retorna palavra no index aleatório
    }
}
