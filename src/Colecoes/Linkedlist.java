package Colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import herdadoconta.Conta;
import herdadoconta.ContaCorrente;

public class Linkedlist {

	public static void main(String[] args) {

		// Generics
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		//List<Conta> lista = new ArrayList<Conta>();

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

/* List é uma interface, a ArrayList e
 LinkedList são implementações.
 As listas garantem a ordem de inserção. 
 Isso significa que ao iterar recebemos os elementos 
 na mesma ordem que eles foram inseridos.
 As listas sempre possuem um índice (podemos acessar 
 o elemento através da posição). Além disso, existe 
 mais uma característica: lista aceitam elementos duplicados.
 */
