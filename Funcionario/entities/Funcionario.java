package entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public void acrescenteSalrio(double porcentagem) {
		salarioBruto += salarioBruto/100*porcentagem;
	}
	public String toString() {
		return nome+", $ "+String.format("%.2f",salarioLiquido());
	}
}
