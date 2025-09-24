public class Verificador {
    //variaveis das cores
    final String VERDE = "\u001b[42m";
    final String AMARELO = "\u001b[43m";
    final String RESET = "\u001b[0m";

    //variáveis que armazenam as strings
    String alvo;
    String chute;

    // construtor
    public Verificador(String alvo) {
        this.alvo=alvo;
    }

    // cada chute, novo valor
    public void setChute(String chute) {
        this.chute=chute;
    }

    // verificar cada letra
    public void verificar() {
        for (int i = 0; i<alvo.length();i++){
            if (chute.substring(i,i+1).equals(alvo.substring(i,i+1))) {
                //letra coincide
                System.out.print(VERDE+chute.substring(i, i+1)+RESET);
            }
            else if(chute.indexOf(alvo.substring(i,i+1)) > -1) {
                //letra existe no alvo, mas na posição errada
                System.out.print(AMARELO+chute.substring(i,i+1)+RESET);
            }
            else {
                //letra errada
                System.out.print(chute.substring(i,i+1));
            }
        }

        //pula linha depois de imprimir cada letra
        System.out.println("");
    }

}
