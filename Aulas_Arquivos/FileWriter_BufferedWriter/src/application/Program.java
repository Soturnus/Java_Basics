package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] { "Bom dia!", "Boa Tarde!", "Boa Noite!" };

		String path = "C:\\Users\\Soturno\\Dropbox\\H4D3S\\Eclipse\\Aulas_Arquivos\\Arquivos\\out.txt";
		
		// para n?o criar um novo arquivo e continuar escrevendo colocar um (path, true)
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}