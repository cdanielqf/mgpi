package test.java;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import main.java.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		long resultado = calc.suma(4, 2);
		long esperado = 6;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testResta() {
		Calculadora calc = new Calculadora();
		long resultado = calc.resta(4, 2);
		long esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testMultiplicar() {
		Calculadora calc = new Calculadora();
		long resultado = calc.multiplicar(4, 2);
		long esperado = 8;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testDividir() {
		Calculadora calc = new Calculadora();
		long resultado = 0;
		try {
			resultado = calc.dividir(4, 2);
		} catch (Exception e) {
			fail("Error en la division normal");
		}
		long esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testDividirPorCero() {
		Calculadora calc = new Calculadora();
		try {
			calc.dividir(4, 0);
			fail("Error: no lanza la excepcion al dividir por 0");
		} catch (Exception e) {
			assertThat(e.getMessage(), CoreMatchers.containsString("Division por 0"));
		}
	}

	@Test
	public void testPotencia() throws Exception {
		Calculadora calc = new Calculadora();
		long resultado = calc.potencia(4, 2);
		long esperado = 16;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testPotencia0a0() {
		Calculadora calc = new Calculadora();
		try {
			calc.potencia(0, 0);
			fail("Error: no lanza la excepcion al elevar 0 al a 0");
		} catch (Exception e) {
			assertThat(e.getMessage(), CoreMatchers.containsString("0 elevado a la 0"));
		}
	}

	@Test
	public void testFactorial() throws Exception {
		Calculadora calc = new Calculadora();
		long resultado = calc.factorial(0);
		long esperado = 1;
		assertEquals(esperado, resultado);

		resultado = calc.factorial(1);
		esperado = 1;
		assertEquals(esperado, resultado);

		resultado = calc.factorial(4);
		esperado = 24;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFactorialNegativo() {
		Calculadora calc = new Calculadora();
		try {
			calc.factorial(-1);
			fail();
		} catch (Exception e) {
			assertThat(e.getMessage(), CoreMatchers.containsString("Factorial de negativo"));
		}
	}
	
	@Test
	public void testFactorialSobrecarga() {
		Calculadora calc = new Calculadora();
		try {
			calc.factorial(20);
			fail();
		} catch (Exception e) {
			assertThat(e.getMessage(), CoreMatchers.containsString("Demasiado grande"));
		}
	}
	
	
}
