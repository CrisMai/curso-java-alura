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

		Conta contaDoRafael = new Conta();
		contaDoRafael.deposita(1000);

		if (contaDoRafael.transfere(300, contaDaCris)) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}

		contaDoRafael.transfere(300, contaDaCris);
		System.out.println(contaDoRafael.saldo);
		System.out.println(contaDaCris.saldo);
	}

}
