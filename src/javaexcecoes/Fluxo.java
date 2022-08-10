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
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
        }
        System.out.println("Fim do metodo2");
    }

}


/* Exceções são problemas que acontecem
 na hora de compilar o código. Toda exceção
 possui um nome que a identifica.
 Exceções não tratadas caem na pilha de
 execução procurando por alguém
 que saiba lidar com ela.
 */

