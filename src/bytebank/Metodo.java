package bytebank;

public class Metodo {

	public static void main(String[] args) {

		Conta contaDaCris = new Conta();
		contaDaCris.saldo = 100;
		contaDaCris.deposita(50);

		System.out.println(contaDaCris.saldo);

		boolean conseguiuRetirar = contaDaCris.saca(20);
		System.out.println(contaDaCris.saldo);
		System.out.println(conseguiuRetirar);
	}

}
