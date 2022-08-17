package Colecoes;

import java.util.ArrayList;

import herdadoconta.Conta;
import herdadoconta.ContaCorrente;

public class TesteArraylistEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);

		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);

		System.out.println("Já existe? " + existe);

	
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}

/* Método equals()
 Existe para sobrescrita.
 A implementação do método equals da classe
 object compara apenas as referências.
 É definido na classe objecrt.
 Devemos sobrescrever o método para definir
 igualdade do objeto.
 */
