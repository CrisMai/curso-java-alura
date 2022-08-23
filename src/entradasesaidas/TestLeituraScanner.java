package entradasesaidas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestLeituraScanner {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while (scanner.hasNextLine()) {
			
			String linha = scanner.nextLine();
			System.out.println(linha);
		}
		
		scanner.close();
	
	}

}
