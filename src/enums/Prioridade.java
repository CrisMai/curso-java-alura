package enums;

public enum Prioridade {
	
	MIN(1), NORMAL(5), MAX(10);
	
	private int valor;
	
	Prioridade(int valor) {
		this.valor = valor;
		
	}
	
	public int getValor() {
		return this.valor;
		
	}
	
}

/* Enums são uma forma orientada a objetos 
 de lidar com os constante.
 */
