package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.print("Nome: ");
		product.nome = sc.next();
		System.out.print("Preço: ");
		product.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.quantidade = sc.nextInt();
		
		System.out.println("Dados do produto: "+product);
		System.out.println();
		System.out.print("Entre com a quantidade de unidades deseja adicionar: ");
		int unidades = sc.nextInt();
		product.add(unidades);
		System.out.println("Dados atualizados: "+product);
		System.out.println();
		System.out.print("Entre com a quantidade de unidades deseja remover: ");
		unidades = sc.nextInt();
		product.remove(unidades);
		System.out.println("Dados atualizados: "+product);
		
		sc.close();

	}

}
