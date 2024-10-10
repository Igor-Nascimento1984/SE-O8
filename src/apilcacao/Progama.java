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

		
		System.out.println(produto.toString());
		System.out.print("ADICONAR PRODUTO: ");
		int quantidade = edd.nextInt();
		produto.addIntens(quantidade);
		System.out.println(produto.toString());
		System.out.print("RETIRAR PRODUTO: ");
		quantidade = edd.nextInt();
		produto.removeIntens(quantidade);
		System.out.println(produto.toString());
		edd.close();
	}

}
