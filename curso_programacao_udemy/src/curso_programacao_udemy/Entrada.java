/*
package curso_programacao_udemy;
import java.util.Locale;
import java.util.Scanner;

public class Entrada {
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	String x;
	int y;
	double z;
	
	x = sc.next();
	y = sc.nextInt();
	z = sc.nextDouble();
	
	System.out.println("Dados digitados:");
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	}
}
*/
/* para double usar sc.nextDouble */
/*
package curso_programacao_udemy;

import java.util.Scanner;

public class Entrada {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		sc.nextLine();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}
}
*/
package curso_programacao_udemy;

import java.util.Scanner;

public class Entrada {
	public static void main(String[] args) {

	double x = 3.0;
	double y = 4.0;
	double z = -5.0;
	double A, B, C;
	
	A = Math.sqrt(x);
	B = Math.sqrt(y);
	C = Math.sqrt(25.0);
	System.out.println("Raiz quadrada de " + x + " = " + A);
	System.out.println("Raiz quadrada de " + y + " = " + B);
	System.out.println("Raiz quadrada de 25 = " + C);
	
	A = Math.pow(x, y);
	B = Math.pow(x, 2.0);
	C = Math.pow(5.0, 2.0);
	System.out.println(x  + " elevado a " + y + " = " + A);
	System.out.println(x  + " elevado ao quadrado = " + B);
	System.out.println("5 elevado ao quadrado = " + C);
	
	A = Math.abs(y);
	B = Math.abs(z);
	System.out.println("Valor absoluto de " + y + " = " + A);
	System.out.println("Valor absoluto de " + z + " = " + B);
	
	}
}