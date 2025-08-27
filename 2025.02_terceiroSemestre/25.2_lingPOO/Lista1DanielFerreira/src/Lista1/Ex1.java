package Lista1;

public class Ex1 {
	public void contarImparIntervalo(int start, int end) {
		int soma = 0;
		int contador = 0;
		for (; start <= end; start++){
			
			if (start % 2 == 1 && start % 3 == 0) {
				contador++; //um número atendeu as condições
				soma += start; //somando os números
			}
		}// fim for
		
		System.out.println("Existem "+contador+" números ímpares e múltiplos de 3");
		System.out.println("A soma dos números encontrados é "+soma);
	}//fim métotdo
}
