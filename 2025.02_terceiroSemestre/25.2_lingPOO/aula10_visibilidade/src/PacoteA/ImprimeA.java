package PacoteA;

public class ImprimeA {
	public static void main(String[] args) {
		
		// instanciar objetos
		ClasseA  a = new ClasseA();
		
		// tentar imprimir coisas
		a.imprimePublico();
		
		a.imprimeProtected();
		
		// não é possível invocar a classe imprimePrivate()
		a.imprimeSegredo();
	}
}
