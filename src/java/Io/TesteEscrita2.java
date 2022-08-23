package java.Io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("asfasdfsafdas dfs sdf asf assdß");

//        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//        fw.write(System.lineSeparator()); // Método para separação de linhas
//        fw.write(System.lineSeparator());
//        fw.write("asfasdfsafdas dfs sdf asf assdß");

		bw.close();

	}

}


/*
 * FileWriter é usada para escrever caracteres. Pode ser combinado com outros
 * Writers, como BufferedWriter.
 */