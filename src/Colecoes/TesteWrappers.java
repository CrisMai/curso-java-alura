package colecoes;

import java.util.List;

public class TesteWrappers {
	
	public static void main(String[] args) {
		
		int idade = 29; // Integer
		Integer idadeRef = Integer.valueOf(29); // Autoboxing
		int valor = idadeRef.intValue(); // Unboxing
		
		System.out.println(idadeRef.doubleValue());
		
		String s = args[0];
		int numero = Integer.parseInt(s); // Método do Integer
		System.out.println(numero);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);

        
		
	}

}



/*
 Para cada tipo primitivo, há uma classe que o representa.
 Para o int há a classe Integer.
 A transformação do tipo primitivo para o objeto referência 
 acontece automaticamente, e é chamada de autoboxing. 
 O caminho inverso é chamado de unboxing.
 As classes que existem para cada tipo primitivo 
 se chamam wrappers - encapsulam a variável do
 tipo primitivo.
 */
