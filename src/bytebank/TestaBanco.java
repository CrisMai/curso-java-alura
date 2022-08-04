package bytebank;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente cris = new Cliente(); 
		cris.nome = "Cris Mai";
		cris.cpf = "123.456.789-00";
		cris.profissao = "desenvolvedora";
		
		Conta contaDaCris = new Conta();
		contaDaCris.deposita(100);
		
		contaDaCris.titular = cris;
		System.out.println(contaDaCris.titular.nome);
		System.out.println(contaDaCris.titular);
		
	}

}
