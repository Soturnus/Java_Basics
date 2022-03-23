package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Soturno\\Dropbox\\H4D3S\\Eclipse\\Bloco_Finally\\src\\Arquivos\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed.");
		}
	}
}
