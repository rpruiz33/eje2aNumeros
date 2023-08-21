package test;
import modelo.Numero;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numero n2=new Numero(3);
		System.out.println(n2.sumar(n2));
		System.out.println(n2.multiplicar(n2));
		System.out.println(n2.esPar());
		System.out.println(n2.esPrimo());
		System.out.println(n2.convertirString(n2.getN()));
		System.out.println(n2.convertirDouble());
		System.out.println(n2.calcularPotencia(2));
		System.out.println(n2.base2(44));
		System.out.println(n2.factorial(10));
		System.out.println(n2.numeroCombinatorio(7,3));
	}

}
