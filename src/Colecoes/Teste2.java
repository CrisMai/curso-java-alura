package colecoes;

import java.util.ArrayList;

import bytebank.Cliente;
import herdadoconta.Conta;
import herdadoconta.ContaCorrente;

public class Teste2 {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);

		// for(int i = 0; i < lista.size(); i++) {
		// Object oRef = lista.get(i);
		// System.out.println(oRef);
		// }

		System.out.println("-------");

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}


/* Estes símbolos que utilizamos (<>) se chamam generics. 
 Temos uma classe, ela é genérica, mas ao utilizá-la, podemos 
 tipificar o que ela conterá, por exemplo, String.
 */
