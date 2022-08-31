package tddteste;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 9);

		Assert.assertEquals(12, soma);

	}

}
