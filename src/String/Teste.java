package String;

import bytebank.Cliente;
import herdadoconta.Conta;
import herdadoconta.ContaCorrente;
import herdadoconta.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		System.out.println("X");
		System.out.println(3);
		System.out.println(true);

		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();

		System.out.println(cc);
		System.out.println(cp);

		println(cliente);
	}

	static void println() {
	}

	static void println(int a) {
	}

	static void println(boolean valor) {
	}

	static void println(Object referencia) {
	}

}


