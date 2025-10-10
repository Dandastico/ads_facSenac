package PacoteB;
import PacoteA.ClasseA;

public class TesteImprimirClasseA {
	public static void main(String[] args) {
		
		// instanciar objetos
		ClasseA a = new ClasseA();
		
		// consegue chamar apenas métodos públicos
		a.imprimePublico();
		a.imprimeSegredo();
	}
		
	
	
	
}
