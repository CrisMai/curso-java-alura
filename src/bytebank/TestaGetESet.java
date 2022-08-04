package bytebank;

public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1334);
		System.out.println(conta.getNumero());
		
		Cliente cris = new Cliente();
		cris.setNome("Cris Mai");
		
		
		conta.setTitular(cris);
		System.out.println(conta.getTitular().getNome());
	}

}
