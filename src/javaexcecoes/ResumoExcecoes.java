package javaexcecoes;

public class ResumoExcecoes {
	
	/* Existe uma hierarquia grande de classes que representam exceções. 
	 * Por exemplo, ArithmeticException é filha de RuntimeException, que herda 
	 * de Exception, que por sua vez é filha da classe mais ancestral 
	 * das exceções, Throwable. 
	 * 
	 * Throwable é a classe que precisa ser extendida para que seja possível 
	 * jogar um objeto na pilha (através da palavra reservada throw).
	 * 
	 * É na classe Throwable que temos praticamente todo o código relacionado 
	 * às exceções, inclusive getMessage() e printStackTrace().
	 * 
	 * A hierarquia iniciada com a classe Throwable é dividida em exceções e erros. 
	 * Exceções são usadas em códigos de aplicação. 
	 * Erros são usados exclusivamente pela máquina virtual.
	 * 
	 * StackOverflowError é um erro da máquina virtual para informar que a 
	 * pilha de execução não tem mais memória.
	 * 
	 * Exceções são separadas em duas grandes categorias: aquelas que são obrigatoriamente 
	 * verificadas pelo compilador e as que não são verificadas.
	 * 
	 * As primeiras são denominadas checked e são criadas através do pertencimento 
	 * a uma hierarquia que não passe por RuntimeException.
	 * 
	 * As segundas são as unchecked, e são criadas como descendentes de RuntimeException.
	 * 
	 * */

}
