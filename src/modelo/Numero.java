package modelo;

import java.util.Iterator;

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
		
		return n == 0 && n% 1 == 0 && n% 3 != 0 && n % 2 != 0;
	}
	
	public String convertirString(int n) {
		
		return String.valueOf(n);
		
	}
	public double convertirDouble() {
	String n="12.22";
	return Double.parseDouble(n);
	}Sxd
	
	public double calcularPotencia(int exp) {
		return Math.pow(4, exp);
	}
	
	public void pasarBase2(int n) {
	
		int num=n;
		int resul=0;
		for (int i=0;i<n;i++) {
			if (num!=0) {
			num=num/2;
			resul=num%2;
			}
			System.out.print(resul);
		}
		
	
	
	
	}
}	