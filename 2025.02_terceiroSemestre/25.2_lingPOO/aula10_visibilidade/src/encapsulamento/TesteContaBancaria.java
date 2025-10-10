package encapsulamento;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		// instanciar objeto
		ContaBancaria conta = new ContaBancaria("daniel", 100);
		
		// testando set e get
		System.out.println("Saldo de " + conta.getTitular() + ": " + conta.getSaldo());
		
		conta.setTitular("carol");
		conta.setSaldo(90000);
		
		System.out.println("Saldo de " + conta.getTitular() + ": " + conta.getSaldo());
		
		System.out.println("----------------------------------------------------------");
		
		// instanciar novo objeto
		ContaBancaria conta2 = new ContaBancaria("Socorro", 500);
		
		// vou tentar fazer uma transferência na classe ContaBancaria
		
	}

}
