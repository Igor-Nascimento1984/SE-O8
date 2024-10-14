package entities02;

public class CurrencyConverter {

		public double valorReal;
		public double cotacao;
		
		public double valorFinal() {
			double real = valorReal*cotacao;
			return (real*0.06)+real;
		}

}
