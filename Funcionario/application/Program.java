package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario emp = new Funcionario();
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		System.out.print("Salario bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.imposto = sc.nextDouble();
		System.out.println();
		
		System.out.print("Funcionario: "+emp);
		System.out.println();
		System.out.println();
		System.out.print("Qual vai ser a porcentagem de aumento ?");
		double porcentagem = sc.nextDouble();
		emp.acrescenteSalrio(porcentagem);
		System.out.println();
		System.out.println("Dados atualizados: "+emp);
		
sc.close();
	}

}
