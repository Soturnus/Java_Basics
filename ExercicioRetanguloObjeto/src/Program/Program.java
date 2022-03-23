package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangulo ret = new retangulo(); 
		
		System.out.print("Digite a largura do retangulo: ");
		ret.width = sc.nextDouble();
		System.out.print("Digite a altura do retangulo: ");
		ret.height = sc.nextDouble();
		
		System.out.println("Area = " + ret.area());
		System.out.println("Perimetro = " + ret.perimeter());
		System.out.println("Diagonal = " + String.format("%.2f", ret.diagonal()));
		
		sc.close();
	}

}
