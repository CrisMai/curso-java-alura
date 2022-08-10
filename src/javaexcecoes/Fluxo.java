package javaexcecoes;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);

			try {
				int a = i / 0;
			} catch (ArithmeticException ex) {
				System.out.println("ArithmeticException");
			}
		}
		
		System.out.println("Fim do metodo2");

	}

}



/*
 Para tratarmos uma exceção usamos um código específico (try). Assim, a
 máquina entenderá que deve tentar executar esse código. Porém, o código nem
 compila e então, devemos usar outro bloco de código por meio de catch,
 sinalizando que devemos capturar o problema.
 */
