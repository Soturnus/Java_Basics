import java.util.Locale;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);

		sc.close();
	}
}
/* Exercicio 2
import java.util.Locale;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);

		sc.close();
	}
}
/*

	public static void main(String[] args) {
		
	String product1 = "Computer";
	String product2 = "Office desk";
	int age = 30;
	int code = 5290;
	char gender = 'F';
	double price1 = 2100.0;
	double price2 = 650.0;
	double measure = 53.234567;

	System.out.println("Products:");
	System.out.printf("%s, which price is $ %.2f\n", product1, price1);
	System.out.printf("%s, which price is $ %.2f\n", product2, price2);
	System.out.printf("Record: %d years old, code %d and gender: %s\n", age, code, gender);
	System.out.printf("Measue with eight decimal places: %.8f\n", measure);
	System.out.printf("Rounded (three decimal places): %.5f\n", measure);
	Locale.setDefault(Locale.US);
	System.out.printf("US decimal point: %.5f", measure);
	
	}

}
*/

/* 
Products:
Computer, which price is $ 2100,00
Office desk, which price is $ 650,50
Record: 30 years old, code 5290 and gender: F
Measue with eight decimal places: 53,23456700
Rouded (three decimal places): 53,235
US decimal point: 53.235

%f = flutuante - float 
%d = inteiro - int 
%s = texto - string 
%n = quebra de texto
*/
