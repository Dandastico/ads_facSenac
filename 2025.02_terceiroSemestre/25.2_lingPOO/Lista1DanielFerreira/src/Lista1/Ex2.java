package Lista1;

public class Ex2 {
	public void compararAltura(double[] alturas) {
		
		System.out.println("Função recebe uma array de valores double");
		System.out.println("Vou armazenar a primeira posição do array em duas variáveis, menor e maior");
		double menor = alturas[0];
		double maior = alturas[0];
		
		System.out.println("Agora vou comparar o valor de cada posição do array, a partir da segunda posição, com os que estão armazenados nas variáveis");
		for (int i = 1; i < alturas.length; i++) {
			System.out.println("Estou comparando a altura "+alturas[i]+" com "+menor+" e "+maior);
			if(menor > alturas[i]) {
				System.out.println(alturas[i]+" é menor que "+menor);
				menor = alturas[i];
			}
			if (maior<alturas[i]){
				System.out.println(alturas[i]+" é maior que "+maior);
				maior = alturas[i];
			}
		}//fim for
		
		System.out.println("O menor valor da altura é "+menor);
		System.out.println("O maior valor da altura é "+maior);
		
	}// fim compararAltura()
}//fim de class
