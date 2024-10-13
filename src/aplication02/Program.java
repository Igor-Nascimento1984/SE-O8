package aplication02;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);

		
		
		System.out.print("RAIO:");
		double raio = edd.nextDouble();

		double c = Calculator.circunferencia(raio);

		double v = Calculator.volume(raio);

		System.out.printf("CIRCUNFERÊNCIA: %.2f%n", c);
		System.out.printf("VOLUME: %.2f%n", v);
		System.out.printf("VALOR DE PI: %.2f%n", Calculator.PI);

		edd.close();
	}

}
