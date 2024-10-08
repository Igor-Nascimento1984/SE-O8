package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// AULA64

		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("MEDIDAS DE X");
		x.a = edd.nextDouble();
		x.b = edd.nextDouble();
		x.c = edd.nextDouble();
		System.out.println("MEDIDAS DE Y");
		y.a = edd.nextDouble();
		y.b = edd.nextDouble();
		y.c = edd.nextDouble();

		double p = (x.a + x.b + x.c) / 2;
		double areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		p = (y.a + y.b + y.c) / 2;
		double areay = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("AREA DE X: %.4f%n",areax);
		System.out.printf("AREA DE X: %.4f%n",areay);

		
		if (areax>areay) {
			System.out.println("AREA X É MAIOR");
		}else {
			System.out.println("AREA Y É MAIOR");
		}
		edd.close();

	}

}
