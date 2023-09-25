package entities;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;

	public Conta() {

	}

	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public Conta(int numero, String titular, double inicialDeposit) {
		this.numero = numero;
		this.titular = titular;
		deposito(inicialDeposit);
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantia) {
		saldo += quantia;
	}

	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}

	public String toString() {
		return "Conta " + numero + ", titular " + titular + ", saldo " + String.format("%.2f", saldo);
	}
}
