package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// so o nome
		System.out.println("GetName: " + path.getName());
		//o diretorio do arquivo
		System.out.println("GetParent: " + path.getParent());
		//o diretorio com o arquivo
		System.out.println("GetPath: " + path.getPath());
		
		sc.close();
	}

}
