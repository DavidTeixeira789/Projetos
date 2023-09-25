package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta cliente;
		System.out.print("Numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Deseja fazer um deposito inicial (s/n)? ");
		char op = sc.next().charAt(0);
		if (op == 's') {
			System.out.println("Entre com o deposito inicial: ");
			double inicialDeposito = sc.nextDouble();
			cliente = new Conta(numero, titular, inicialDeposito);
		} else {
			cliente = new Conta(numero, titular);
		}
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(cliente);
		System.out.println();
		System.out.print("Entre com um deposito: ");
		double deposito = sc.nextDouble();
		cliente.deposito(deposito);
		System.out.println("Dados atualizados: ");
		System.out.println(cliente);
		System.out.println();
		System.out.print("Quanto deseja sacar? ");
		deposito = sc.nextDouble();
		cliente.saque(deposito);
		System.out.println("Dados atualizados: ");
		System.out.println(cliente);
		sc.close();

	}

}
