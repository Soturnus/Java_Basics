package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
			
		
		/*
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());*/
		
		//Compara em booleano
		//System.out.println(a.equals(b));	
		
		// HashCode metodo que retorna um número inteiro representando um código gerado a partir das informações do objeto. 

	}
}
