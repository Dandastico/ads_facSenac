package encapsulamento;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	// construtor
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	} // fim construtor
	
	// métodos set não retornam nada, podem ter lógica de negócio
	public void setTitular(String titular) {
		this.titular = titular;
	} // fim método set
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} // fim método set
	
	// métodos get retornam, nunca tem lógica de negócio
	public String getTitular() {
		return this.titular;
	} // fim método get
	
	public double getSaldo() {
		return this.saldo;
	} // fim método get
	
	
	// tentar fazer um método para transferir dinheiro
	
	
}
