package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Entre com os dados do retangulo:");
		System.out.print("Largura:");
		ret.largura = sc.nextDouble();
		System.out.print("Altura:");
		ret.altura = sc.nextDouble();
		System.out.println("Area = "+String.format("%.2f", ret.area()));
		System.out.println("Perimetro = "+String.format("%.2f", ret.perimetro()));
		System.out.println("Diagonal = "+String.format("%.2f", ret.diagonal()));
		
		
		
		sc.close();

	}

}
