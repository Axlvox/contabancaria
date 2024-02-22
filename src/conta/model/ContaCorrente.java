package conta.model;

public class ContaCorrente extends Conta {

	private float limit;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limit = limite;
	}

	public float getLimite() {
		return limit;
	}

	public void setLimite(float limite) {
		this.limit = limite;
	}

	public boolean sacar(float valor) {
		
		if(this.getBalance() + this.getLimite() < valor) {
			System.out.println("Valor insuficiente.");
			return false;
		}
		
		this.setBalance(this.getBalance() - valor);
		return true;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de crédito: " + this.limit);
	}
} 

	