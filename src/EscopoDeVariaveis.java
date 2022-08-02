
public class EscopoDeVariaveis {

	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 3;

		// boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar, pois está acompanhado.");
			} else {
				System.out.println("Infelizmente você não pode entrar.");
			}

		}
	}

}
