package entidade;

public class Produto {
		// AULA 67
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque() {
		return preco*quantidade;
	}
	
	public void addIntens(int quantidade) {
		this.quantidade += quantidade; 
	}
	
	public void removeIntens(int quantidade) {
		this.quantidade -= quantidade; 
	}
}
