package java.Io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com Arquivo
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis); // Transforma os bytes em caracteres

		BufferedReader br = new BufferedReader(isr); // Le linha por linha
		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		System.out.println(linha);

		br.close();
	}

}


/* FileInputStream: estabelece um fluxo de entrada com arquivo
 lendo os bytes.
 InputStreamReader: transformas esses bytes em caracteres.
 BufferedRead: lê a linha inteira do arquivo.
 
 Saiba que o FileInputStream é um InputStream e o 
 InputStreamReader é um Reader.
 
 */