package colecoes;

import java.util.Vector;
import java.util.List;

import herdadoconta.Conta;
import herdadoconta.ContaCorrente;

public class TesteVector {
	
	public static void main(String[] args) {
		
		List<Conta> lista = new Vector<Conta>(); // Thread safe

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


		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}


/* O java.util.Vector é uma ArrayList thread safe.
 Implementa a interface List.
 */
