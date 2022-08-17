package Colecoes;

import bytebank.Cliente;
import herdadoconta.Conta;
import herdadoconta.ContaCorrente;
import herdadoconta.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;

		Cliente cliente = new Cliente();
		referencias[2] = cliente;

		// System.out.println(cc2.getNumero());

		// Object referenciaGenerica = contas[1];

		// System.out.println( referenciaGenerica.getNumero() );

		ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());

	}

}

/* Cast
 * Transformamos uma referência de um tipo mais genérico, para uma de um tipo
 * mais específico. Isso pode ser chamado também de type cast.
 */
