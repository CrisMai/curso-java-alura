package Colecoes;

import herdadoconta.Conta;
import herdadoconta.ContaCorrente;

public class TesteArraylist {
	
	public static void main(String[] args) {
		
		ArrayList guardador = new ArrayList();
		
		Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);
        
        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);
        
        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(1);
        System.out.println(ref.getNumero());
       	
	}

}
