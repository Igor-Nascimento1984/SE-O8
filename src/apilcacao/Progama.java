package apilcacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Progama {

	public static void main(String[] args) {
		// AULA 67

		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);

		Produto produto = new Produto();

		System.out.println("DADOS DO PRODUTO");
		System.out.print("PRODUTO:");
		produto.nome = edd.nextLine();
		System.out.print("PREÇO:");
		produto.preco = edd.nextDouble();
		System.out.print("QUANTIDADE:");
		produto.quantidade = edd.nextInt();

		edd.close();
	}

}
