package herdadoconta;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel, Serializable {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
    public void saca(double valor) throws SaldoInsuficienteException {
       double valorASacar = valor + 0.2;
       super.saca(valorASacar);
    }

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
	    return "ContaCorrente: " + super.toString();
	}

}


/* O método toString() existe para desenvolver uma
informação sobre o estado do objeto e para ser
sobrescrito.
*/