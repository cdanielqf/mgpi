package main.java;

public class Calculadora {
	
	public Calculadora() {
	}

	public long suma(long a, long b) {
		return a + b;
	}

	public long resta(long a, long b) {
		return a - b;
	}

	public long multiplicar(long a, long b) {
		return a * b;
	}

	public long dividir(long a, long b) throws Exception{
		if (b==0) throw new Exception("Division por 0");
		return (long) a/b;
	}
	
	public long potencia(long a, long b) throws Exception {
		if (a==0 && b==0) throw new Exception("0 elevado a la 0");
		return (long) Math.pow(a, b);
	}
	
	public long factorial(long a) throws Exception {
		if (a < 0) throw new Exception("Factorial de negativo");
		if (a > 10) throw new Exception("Demasiado grande");
		if (a <= 1) return 1;
		return a * factorial(a-1);
	}
	/*
	public static void main(String[] args) {
		System.out.println("Hello World");
	}*/

}
