package javaexcecoes;

import herdadoconta.Conta;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Inicio do metodo2");
		
		
		throw new MinhaExcecao("deu muito errado");
		
		//System.out.println("Fim do metodo2");

	}

}


/* Checked - estende diretamente de 
 Exception. É verificada pelo compilador.
  
 Unchecked - estende de RuntimeException.
 Não é verificada pelo compilador.
 */



