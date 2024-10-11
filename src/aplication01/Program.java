package aplication01;

import java.util.Locale;
import java.util.Scanner;

import entities01.Retangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.println("MEDIDAS DO RETANGULO");
		System.out.print("ALTURA: ");
		retangulo.altura = edd.nextDouble();

		System.out.print("LARGURA: ");
		retangulo.largura = edd.nextDouble();

		System.out.println(retangulo.toString());

		edd.close();
	}

}
