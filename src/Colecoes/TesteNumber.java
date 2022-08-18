package colecoes;

import java.util.List;

public class TesteNumber {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.intValue());

		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());// unboxing

		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());

		Number refNumero = Float.valueOf(30.5f); // classe Number
		System.out.println(refNumero.floatValue());

	}

}

/*
 Number é a classe-mãe.
*/
