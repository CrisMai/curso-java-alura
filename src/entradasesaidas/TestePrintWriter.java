package entradasesaidas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintWriter {

	public static void main(String[] args) throws IOException {

		// PrintStream ps = new PrintStream("lorem2.txt");

		PrintWriter ps = new PrintWriter("lorem2.txt");

		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println(); // nova linha
		ps.println("asfasdfsafdas dfs sdf asf assdß");

		ps.close();

	}
}


/*
 * PrintStream não possui o método write e sim o método print. Ele também não
 * tem o método newLine, então no caso de precisar pular uma linha após ela ser
 * escrita, há o método println.
 * 
 * PrintWriter foi incluído na biblioteca java depois do PrintStream, mas faz a
 * mesma função do PrintStream.
 */
