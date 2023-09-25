package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y;
		x =  new Triangulo();
		y =  new Triangulo();
		
		System.out.println("Entre com as medidas do triangulo X: ");
		x.A = sc.nextDouble();
		x.B = sc.nextDouble();
		x.C = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo Y: ");
		y.A = sc.nextDouble();
		y.B = sc.nextDouble();
		y.C = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area do X = %.4f%n",areaX);
		System.out.printf("Area do Y = %.4f%n",areaY);
		
		if(areaX>areaY) {
			System.out.println("Area maior: X");
		}else {
			System.out.println("Area maior: Y");
		}
		
		sc.close();

	}

}
