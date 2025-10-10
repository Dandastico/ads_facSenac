package PacoteA;

public class ClasseA {
	
	public void imprimePublico() {
		System.out.println("Sou público");
	
	} // fim método
	
	
	protected void imprimeProtected() {
		System.out.println("Sou protegido");
	} // fim método
	
	
	private void imprimePrivate() {
		// métodos privados são muito utilizados para configuração, sendo chamadas por outros métodos
		System.out.println("Sou privado, era pra ninguém me ver");
	} // fim método
	
	
	public void imprimeSegredo() {
		this.imprimePrivate();
	}
	
	
}// fim classe
