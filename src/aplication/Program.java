package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// AULA64

		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;

		System.out.println("MEDIDAS DE X");
		xA = edd.nextDouble();
		xB = edd.nextDouble();
		xC = edd.nextDouble();
		System.out.println("MEDIDAS DE Y");
		yA = edd.nextDouble();
		yB = edd.nextDouble();
		yC = edd.nextDouble();

		double p = (xA + xB + xC) / 2;
		double areax = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		p = (yA + yB + yC) / 2;
		double areay = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
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
