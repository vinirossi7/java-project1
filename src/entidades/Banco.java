package entidades;

public class Banco {

	private String nome;
	private int numConta;
	private double saldo;
	
	
	public Banco() {
		
	}
	
	public Banco(String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;
	}
	
	public Banco(String nome, int numConta, double saldoInicial) {
		this.nome = nome;
		this.numConta = numConta;
		deposito(saldoInicial);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumConta() {
		return numConta;
	}
	public double getSaldo() {
		return saldo;
	}

	public double saldoTotal() {
		return saldo;
	}
	
	public String alteraNome() {
		return nome;
	}
	
	public void deposito(double montante) {
		this.saldo += montante;
	}
	
	public void saque(double montante) {
		this.saldo -= montante + 5.00;
	}
	
	public String toString() {
		return nome
			+ ", Conta Corrente: "
			+numConta
			+ ", Saldo: $ "
			+ String.format("%.2f", saldoTotal());
	}

}
