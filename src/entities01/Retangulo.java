package entities01;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double area() {
		return largura*altura;
	} 
	
	public double perimetro() {
		return 2*(altura+largura);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.sqrt(altura)+Math.sqrt(largura));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", area())+ " - "
			+ "PERIMETRO = " + String.format("%.2f", perimetro())+ " - "
			+ "DIAGONAL = " + String.format("%.2f", diagonal());
				}
}
