package aplication03;

import java.util.Locale;
import java.util.Scanner;

import entities02.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);
		CurrencyConverter conta = new CurrencyConverter();
		System.out.print("COTAÇÃO DOLAR: ");
		conta.valorReal = edd.nextDouble();
		System.out.print("VALOR QUE DESEJA ADQUIRIR EM DOLAR: ");
		conta.cotacao = edd.nextDouble();
		System.out.print("VALOR PARA PAGAR (EM REAL): R$");
		System.out.printf(String.format("%.2f%n", conta.valorFinal()));

		edd.close();

	}

}
