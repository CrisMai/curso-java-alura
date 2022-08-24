package entradasesaidas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//String nome = "Cris Mai";

//		ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		ois.readObject();
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);

	}
	
}

/*
 * A criação do fluxo binário a partir de um objeto é chamado de serialização. A
 criação de um objeto a partir de um um fluxo binário é chamado de
 desserialização. A serialização sempre funciona em cascata, mas há a
 possibilidade de usar a palavra chave transient para "fugir" da serialização
 de um determinado atributo.
 */