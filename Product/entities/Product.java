package entities;

public class Product {

	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotal() {
		return quantidade * preco;
	}

	public void remove(double quantidade) {
       this.quantidade -= quantidade;
	}
	public void add(double quantidade) {
	       this.quantidade += quantidade;
		}
		
	public String toString() {
		return nome + ", $ " + String.format("%.2f",preco) + ", " + quantidade + " unidades, total: $ "
				+ String.format("%.2f", valorTotal());

	}

}
