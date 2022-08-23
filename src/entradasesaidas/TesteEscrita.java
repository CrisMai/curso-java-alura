package entradasesaidas;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de Saída de Dados
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);

		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("jhsfkjhdjfhrekjkmvn,fdkghjrskdjkfjrk");
		bw.newLine();
		bw.write("ncdmhjuruitrhgfjvnjsabdje");

		bw.close();

	}

}


/* Para saída de dados em vez de utilizarmos o InputStream, 
 faremos uso do OutputStream, e em vez do Reader, teremos o Writer.
 */
