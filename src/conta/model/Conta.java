package conta.model;

public class Conta {

	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero; 
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumber() { 
		return numero;
	}

	public void setNumber(int numero) { 
		this.numero = numero;
	}

	public int getAgency() {
		return agencia;
	}

	public void setAgency(int agencia) {
		this.agencia = agencia;
	}

	public int getType() {
		return tipo;
	}

	public void setType(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getBalance() {
		return saldo;
	}

	public void setBalance(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {
		if (this.saldo < valor)
			return false;

		this.setBalance(this.saldo - valor);
		return true;
	}

	public void depositar(float valor) {
		this.setBalance(this.saldo + valor);
	}


	public void visualizar() {

		String tipoConta = ("");

		switch (tipo) {
		case 1:
			tipoConta = "Conta Corrente";
			break;

		case 2:
			tipoConta = "Conta Poupança";
			break;
		}

		System.out.println("\nDados da conta:");
		System.out.println(" Número da conta: " + this.numero);
		System.out.println(" Agencia da conta: " + this.agencia);
		System.out.println(" Tipo da conta: " + tipoConta);
		System.out.println(" Titular da conta: " + this.titular);
		System.out.println(" Saldo da conta: " + this.saldo);
	}

}
