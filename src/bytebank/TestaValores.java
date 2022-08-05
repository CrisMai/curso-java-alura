package bytebank;

public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1334, 24226);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123123);
		
		Conta conta2 = new Conta(1334, 34326);
		Conta conta3 = new Conta(2236, 58793);
		
		System.out.println(Conta.getTotal());
		
	}

}
