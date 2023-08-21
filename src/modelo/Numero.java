package modelo;

public class Numero {

	private int n;

	public Numero(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int sumar(Numero n) {
		return n.n + this.n;
	}

	public int multiplicar(Numero n) {
		return n.n * this.n;
	}

	public boolean esPar() {

		return this.n % 2 == 0;
	}

	public boolean esPrimo() {

		return n == 0 && n % 1 == 0 && n % 3 != 0 && n % 2 != 0;
	}

	public String convertirString(int n) {

		return String.valueOf(n);

	}

	public double convertirDouble() {
		String n = "12.22";
		return Double.parseDouble(n);
	}

	public double calcularPotencia(int exp) {
		return Math.pow(4, exp);
	}

	public String base2(int numDecimal) {
		int numBinario, base, resto;

		base = 1;
		resto = 0;
		numBinario = 0;

		while (numDecimal > 0) {
			resto = numDecimal % 2;
			numBinario = numBinario + resto * base;
			base = base * 10;
			numDecimal = numDecimal / 2;
		}

		return convertirString(numBinario);

	}

	public int factorial(int n) {
		int  factorial;

		factorial = 1;
		if (n > 0) {
			for (int contador = 1; contador <= n; contador++) {
				factorial = factorial * contador;
			}

		}
		return factorial;
	}
	public int numeroCombinatorio(int n1, int n) {
		int numerador=factorial(n1);
		int denominador=factorial(n)*factorial(n1-n);
	
		return  numerador/denominador;
		
	}
	
}