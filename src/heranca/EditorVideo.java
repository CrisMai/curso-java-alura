package heranca;

public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do editor de vídeo");
		return super.getBonificacao() + 100;
	}

}
